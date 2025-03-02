package module.designpatterns.chuprojet.Person;

import module.designpatterns.chuprojet.Batiment.Batiment;

import java.time.LocalDateTime;

public class DirecteurFactory implements PersonnelAbstractFactory {
    @Override
    public Directeur createPersonnel(String nom, String prenom, String fonction, LocalDateTime birthDate, String personnelId, Batiment batiment) {
        return new Directeur(null, nom, prenom, fonction, birthDate, personnelId, batiment);
    }
}
