package module.designpatterns.chuprojet.Person.factory;

import module.designpatterns.chuprojet.Batiment.Batiment;
import module.designpatterns.chuprojet.Person.modal.Personnel;

import java.time.LocalDateTime;

public interface PersonnelAbstractFactory {
    Personnel createPersonnel(String nom, String prenom, String fonction, LocalDateTime birthDate, String personnelId, Batiment batiment);
}
