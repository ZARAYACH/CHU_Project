package module.designpatterns.chuprojet.Person.factory;

import module.designpatterns.chuprojet.Batiment.modal.Batiment;
import module.designpatterns.chuprojet.Person.modal.Medecin;

import java.time.LocalDateTime;

public class MedecinFactory implements PersonnelAbstractFactory {

    @Override
    public Medecin createPersonnel(String nom, String prenom, String fonction, LocalDateTime birthDate, String personnelId, Batiment batiment) {
        return new Medecin(null, nom, prenom, fonction, birthDate, personnelId, batiment, null); // Section can be added later
    }
}

