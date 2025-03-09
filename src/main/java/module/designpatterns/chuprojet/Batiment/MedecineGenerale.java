
package module.designpatterns.chuprojet.Batiment;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class MedecineGenerale extends Batiment {
    public MedecineGenerale(Long id, String emplacement, Long taille, String fonctionnalite, String description) {
        super(id, emplacement, taille, fonctionnalite, description);
    }
}
