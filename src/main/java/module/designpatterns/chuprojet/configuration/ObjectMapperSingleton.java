package module.designpatterns.chuprojet.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

@ApplicationScoped
public class ObjectMapperSingleton {

    @Produces
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
