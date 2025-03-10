package module.designpatterns.chuprojet.Person.factory;

import module.designpatterns.chuprojet.Batiment.Batiment;
import module.designpatterns.chuprojet.Person.modal.AgentAide;

import java.time.LocalDateTime;

public class AgentAideFactory implements PersonnelAbstractFactory {
    @Override
    public AgentAide createPersonnel(String nom, String prenom, String fonction, LocalDateTime birthDate, String personnelId, Batiment batiment) {
        return new AgentAide(null, nom, prenom, fonction, birthDate, personnelId, batiment);
    }
}
