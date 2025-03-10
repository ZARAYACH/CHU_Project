
package module.designpatterns.chuprojet.Services.modal;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ChuServiceUrgence extends ChuService {

    public ChuServiceUrgence(Long id) {
        super(id);
    }

    @Override
    public void servie() {
        System.out.println("service Urgence served");

    }

    @Override
    public void update(String message) {
        System.out.println("service Urgence updated");
    }
}
