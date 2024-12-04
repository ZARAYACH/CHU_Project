package module.designpatterns.chuprojet.DOA;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped
public class EntityManagerSingleton {

    private EntityManager entityManager;
    private final JpaEntityManagerFactory jpaEntityManagerFactory;
    @PostConstruct
    private void init() {
        System.out.println("Singleton bean initialized.");
    }
    @Inject
    public EntityManagerSingleton(JpaEntityManagerFactory jpaEntityManagerFactory) {
        this.jpaEntityManagerFactory = jpaEntityManagerFactory;
        this.entityManager = jpaEntityManagerFactory.getEntityManagerFactory().createEntityManager();
    }

    @Produces
    private EntityManager getEntityManager() {
        if (entityManager != null) {
            return entityManager;
        }
        entityManager = jpaEntityManagerFactory.getEntityManagerFactory().createEntityManager();
        return entityManager;
    }


}
