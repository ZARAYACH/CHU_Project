package module.designpatterns.chuprojet.Services.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeServiceImpl implements Service {

    private List<Service> services = new ArrayList<>();

    public void ajouterService(Service service) {
        services.add(service);
    }

    public void supprimerService(Service service) {
        services.remove(service);
    }

    @Override
    public void servie() {
        services.forEach(Service::servie);
    }
}
