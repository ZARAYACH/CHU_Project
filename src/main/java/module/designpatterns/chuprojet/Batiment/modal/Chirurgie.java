
package module.designpatterns.chuprojet.Batiment.modal;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Chirurgie extends Batiment {
    public Chirurgie(Long id, String emplacement, Long taille, String fonctionnalite, String description) {
        super(id, emplacement, taille, fonctionnalite, description);
    }
}
