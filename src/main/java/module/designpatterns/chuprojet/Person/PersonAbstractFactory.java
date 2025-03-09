package module.designpatterns.chuprojet.Person;

import java.time.LocalDateTime;

public interface PersonAbstractFactory {
    Person createPerson(String nom, String prenom, String fonction, LocalDateTime birthDate);

}
