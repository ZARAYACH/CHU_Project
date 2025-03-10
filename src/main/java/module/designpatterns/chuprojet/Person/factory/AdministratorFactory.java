package module.designpatterns.chuprojet.Person.factory;

import module.designpatterns.chuprojet.Batiment.modal.Batiment;
import module.designpatterns.chuprojet.Person.modal.Administrateur;

import java.time.LocalDateTime;

public class AdministratorFactory implements PersonnelAbstractFactory {
    @Override
    public Administrateur createPersonnel(String nom, String prenom, String fonction, LocalDateTime birthDate, String personnelId, Batiment batiment) {
        return new Administrateur(null, nom, prenom, fonction, birthDate, personnelId, batiment);
    }
}
