package module.designpatterns.chuprojet.Person.facade;

import module.designpatterns.chuprojet.Person.modal.Patient;

public interface FacadeGestionPatient {
    void gererNouveauPatient(String nom, String prenom, String code, String situationMedicale);
    void radio(Patient patient);
    void admitToEmergency(Patient patient);
}
