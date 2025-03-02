package module.designpatterns.chuprojet.Batiment;

public interface BatimentFactory {

    Batiment creeBatiment(Batiment.category category, String emplacement, Long taille, String Functionality, String description);
}
