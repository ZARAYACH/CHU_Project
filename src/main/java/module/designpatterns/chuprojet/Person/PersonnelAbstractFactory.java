package module.designpatterns.chuprojet.Person;

import module.designpatterns.chuprojet.Batiment.Batiment;

import java.time.LocalDateTime;

public interface PersonnelAbstractFactory {
    Personnel createPersonnel(String nom, String prenom, String fonction, LocalDateTime birthDate, String personnelId, Batiment batiment);
}
