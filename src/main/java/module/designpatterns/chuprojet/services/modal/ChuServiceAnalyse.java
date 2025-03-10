
package module.designpatterns.chuprojet.services.modal;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ChuServiceAnalyse extends ChuService {
    public ChuServiceAnalyse(Long id) {
        super(id);
    }

    @Override
    public void servie() {
        System.out.println("service analyse served");
    }

    @Override
    public void update(String message) {
        System.out.println("service analyse update");
    }
}
