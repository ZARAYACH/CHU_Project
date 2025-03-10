
package module.designpatterns.chuprojet.Services.modal;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class ChuServiceRadiologie extends ChuService {
    public ChuServiceRadiologie(Long id) {
        super(id);
    }

    @Override
    public void servie() {
        System.out.println("service Radiologie served");
    }

    @Override
    public void update(String message) {
        System.out.println("service Radiologie update");
    }
}
