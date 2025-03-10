package module.designpatterns.chuprojet.services.obsarvable;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observateur> observateurs = new ArrayList<>();

    public void ajouterObservateur(Observateur obs) {
        observateurs.add(obs);
    }

    public void notifierObservateurs(String message) {
        for (Observateur obs : observateurs) {
            obs.update(message);
        }
    }
}
