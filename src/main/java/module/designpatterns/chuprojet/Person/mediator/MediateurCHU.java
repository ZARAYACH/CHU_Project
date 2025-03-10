package module.designpatterns.chuprojet.Person.mediator;

import module.designpatterns.chuprojet.Person.modal.Personnel;

import java.util.ArrayList;
import java.util.List;

public class MediateurCHU implements Mediateur {
    private List<Personnel> chefsDeService = new ArrayList<>();

    public void ajouterChefDeService(Personnel chef) {
        chefsDeService.add(chef);
    }

    @Override
    public void envoyerMessage(String message, Personnel expediteur) {
        for (Personnel chef : chefsDeService) {
            if (chef != expediteur) {
                chef.recevoirMessage(message, expediteur.getNom());
            }
        }
    }
}
