package module.designpatterns.chuprojet.Person;

import java.time.LocalDateTime;

public class PatientFactory implements PersonAbstractFactory {
    @Override
    public Patient createPerson(String nom, String prenom, String fonction, LocalDateTime birthDate) {
        return new Patient(null, nom, prenom, fonction, birthDate, null, null, null);
    }
}
