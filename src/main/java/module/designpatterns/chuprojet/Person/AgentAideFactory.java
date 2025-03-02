package module.designpatterns.chuprojet.Person;

import module.designpatterns.chuprojet.Batiment.Batiment;

import java.time.LocalDateTime;

public class AgentAideFactory implements PersonnelAbstractFactory {
    @Override
    public AgentAide createPersonnel(String nom, String prenom, String fonction, LocalDateTime birthDate, String personnelId, Batiment batiment) {
        return new AgentAide(null, nom, prenom, fonction, birthDate, personnelId, batiment);
    }
}
