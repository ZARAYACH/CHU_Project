package module.designpatterns.chuprojet.DOA;


import jakarta.inject.Inject;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class CustomServletContextListener implements ServletContextListener {

    @Inject
    private EntityManagerSingleton entityManagerSingleton;

    public CustomServletContextListener() {
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            entityManagerSingleton.getEntityManager();
        } catch (Exception e) {
            System.err.println("Failed to initialize EntityManagerFactory: " + e.getMessage());
            e.printStackTrace();
            throw new IllegalStateException("Application startup failed due to EntityManagerFactory initialization error.", e);

        }
    }
}
