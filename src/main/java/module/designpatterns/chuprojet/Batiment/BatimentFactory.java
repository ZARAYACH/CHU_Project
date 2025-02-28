package module.designpatterns.chuprojet.Batiment;

public interface BatimentFactory {

    <T extends Batiment> T creeBatiment(Class<T> batimentClass, String emplacement, Long taille, String Functionality, String description);
}
