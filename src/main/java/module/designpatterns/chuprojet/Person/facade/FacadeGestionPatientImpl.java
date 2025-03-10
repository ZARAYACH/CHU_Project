package module.designpatterns.chuprojet.Person.facade;

import jakarta.enterprise.context.ApplicationScoped;
import module.designpatterns.chuprojet.Person.modal.Patient;

@ApplicationScoped
public class FacadeGestionPatientImpl implements FacadeGestionPatient {

    @Override
    public void gererNouveauPatient(String nom, String prenom, String code, String situationMedicale) {
        System.out.println("new Patient " + nom + " " + prenom + " " + code + " " + situationMedicale);
    }
    @Override
    public void radio(Patient patient) {
        System.out.println("patient new radio request" + patient);
    }
    @Override
    public void admitToEmergency(Patient patient) {
        System.out.println("patient admitted to emergency " + patient.getNom());
    }
}
