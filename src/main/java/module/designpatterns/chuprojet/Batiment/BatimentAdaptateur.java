package module.designpatterns.chuprojet.Batiment;

import lombok.Getter;

public class BatimentAdaptateur implements BatimentAdaptable {
    @Getter
    private Batiment batiment;
    private final String nouvelleFonctionnalite;
    private final String ancienneFonctionnalite;


    public BatimentAdaptateur(Batiment batiment, String nouvelleFonctionnalite) {
        this.batiment = batiment;
        this.ancienneFonctionnalite = batiment.getFonctionnalite();
        this.nouvelleFonctionnalite = nouvelleFonctionnalite;
    }

    @Override
    public void adapter() {
        System.out.println("Adaptation du bâtiment : " + batiment.getDescription());
        System.out.println("Nouvelle fonctionnalité : " + nouvelleFonctionnalite);
        batiment.setFonctionnalite(nouvelleFonctionnalite);
    }
    public void restaurer() {
        System.out.println("↩️ Restauration de l'ancienne fonctionnalité : " + ancienneFonctionnalite);
        batiment.setFonctionnalite(ancienneFonctionnalite);
    }

}
