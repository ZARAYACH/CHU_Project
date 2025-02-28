package module.designpatterns.chuprojet.Batiment;

import java.lang.reflect.InvocationTargetException;

public class BatimentFactoryImpl implements BatimentFactory {

    @Override
    public <T extends Batiment> T creeBatiment(Class<T> batimentClass, String emplacement, Long taille, String Functionality, String description) {
        try {
            T batiment = batimentClass.getConstructor().newInstance();
            batiment.setEmplacement(emplacement);
            batiment.setDescription(description);
            batiment.setTaille(taille);
            batiment.setFonctionnalite(Functionality);
            return batiment;
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }
}
