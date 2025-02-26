package module.designpatterns.chuprojet.Batiment;

public class BatimentFactory {

    public static <T extends Batiment> T creerBatiment(Class<T> type, String emplacement, Long taille, String Functionality, String description) {
        try {
            T batiment = type.getConstructor().newInstance();
            batiment.setEmplacement(emplacement);
            batiment.setDescription(description);
            batiment.setTaille(taille);
            batiment.setFonctionnalite(Functionality);
            return batiment;
        } catch (Exception e) {
            throw new RuntimeException("Impossible de créer le bâtiment de type: " + type.getSimpleName(), e);
        }
    }
}
