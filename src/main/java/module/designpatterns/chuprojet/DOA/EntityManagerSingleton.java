package module.designpatterns.chuprojet.DOA;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.persistence.EntityManager;
import lombok.NoArgsConstructor;

@Singleton
@NoArgsConstructor
public class EntityManagerSingleton {

    private EntityManager entityManager;
    private JpaEntityManagerFactory jpaEntityManagerFactory;

    @Inject
    public EntityManagerSingleton(JpaEntityManagerFactory jpaEntityManagerFactory) {
        this.jpaEntityManagerFactory = jpaEntityManagerFactory;
        this.entityManager = jpaEntityManagerFactory.getEntityManagerFactory().createEntityManager();
    }

    @Produces
    public EntityManager getEntityManager() {
        if (entityManager != null) {
            return entityManager;
        }
        entityManager = jpaEntityManagerFactory.getEntityManagerFactory().createEntityManager();
        return entityManager;
    }


}
