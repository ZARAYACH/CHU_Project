package module.designpatterns.chuprojet.DOA;

import com.mysql.cj.jdbc.MysqlDataSource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;
import org.hibernate.jpa.boot.internal.PersistenceUnitInfoDescriptor;

import jakarta.persistence.spi.PersistenceUnitInfo;
import org.reflections.Reflections;
import sun.reflect.ReflectionFactory;

import javax.sql.DataSource;
import java.util.*;
import java.util.stream.Collectors;

@ApplicationScoped
public class JpaEntityManagerFactory {

    private String DB_URL = "jdbc:mysql://localhost:3307/CHU?createDatabaseIfNotExist=true&useSSL=false";
    private String DB_USER_NAME = "root";
    private String DB_PASSWORD = "root";

    public JpaEntityManagerFactory() {
    }


    protected EntityManagerFactory getEntityManagerFactory() {
        PersistenceUnitInfo persistenceUnitInfo = getPersistenceUnitInfo(
                getClass().getSimpleName());
        Map<String, Object> configuration = new HashMap<>();
        return new EntityManagerFactoryBuilderImpl(
                new PersistenceUnitInfoDescriptor(persistenceUnitInfo), configuration)
                .build();
    }

    protected HibernatePersistenceUnitInfo getPersistenceUnitInfo(String name) {
        return new HibernatePersistenceUnitInfo(name, getEntityClassNames(), getProperties());
    }


    protected List<String> getEntityClassNames() {
        return Arrays.stream(getEntities())
                .map(Class::getName)
                .collect(Collectors.toList());
    }

    protected Properties getProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        properties.put("hibernate.id.new_generator_mappings", false);
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("hibernate.connection.datasource", getMysqlDataSource());
        return properties;
    }

    protected Class[] getEntities() {
        Reflections reflections = new Reflections("module.designpatterns.chuprojet");
        Set<Class<?>> entityClasses = reflections.getTypesAnnotatedWith(Entity.class);
        return entityClasses.toArray(new Class[0]);
    }

    protected DataSource getMysqlDataSource() {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setURL(DB_URL);
        mysqlDataSource.setUser(DB_USER_NAME);
        mysqlDataSource.setPassword(DB_PASSWORD);
        return mysqlDataSource;
    }


}
