package module.designpatterns.chuprojet.Batiment;

public class BatimentFactoryImpl implements BatimentFactory {

    @Override
    public Batiment creeBatiment(Batiment.category category, String emplacement, Long taille, String functionality, String description) {
        return switch (category) {
            case ADMINISTRATION -> new Administration(null, emplacement, taille, functionality, description);
            case CHIRUGIE -> new Chirurgie(null, emplacement, taille, functionality, description);
            case LABORATOIRES -> new Laboratoires(null, emplacement, taille, functionality, description);
            case MEDECINE_GENERALE -> new MedecineGenerale(null, emplacement, taille, functionality, description);
            case RADIOLOGIE -> new Radiologie(null, emplacement, taille, functionality, description);
            case SPECIALIRES_MEDICALES ->
                    new SpecialitesMedicales(null, emplacement, taille, functionality, description);
            case URGENCE -> new Urgence(null, emplacement, taille, functionality, description);
        };

    }
}
