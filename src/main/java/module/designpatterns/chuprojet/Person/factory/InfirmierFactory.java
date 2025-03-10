package module.designpatterns.chuprojet.Person.factory;

import module.designpatterns.chuprojet.Batiment.modal.Batiment;
import module.designpatterns.chuprojet.Person.modal.Infirmier;

import java.time.LocalDateTime;

public class InfirmierFactory implements PersonnelAbstractFactory {
    @Override
    public Infirmier createPersonnel(String nom, String prenom, String fonction, LocalDateTime birthDate, String personnelId, Batiment batiment) {
        return new Infirmier(null, nom, prenom, fonction, birthDate, personnelId, batiment);
    }
}
