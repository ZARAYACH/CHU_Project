package module.designpatterns.chuprojet.Person;

public interface FacadeGestionPatient {
    void gererNouveauPatient(String nom, String prenom, String code, String situationMedicale);
    void radio(Patient patient);
    void admitToEmergency(Patient patient);
}
