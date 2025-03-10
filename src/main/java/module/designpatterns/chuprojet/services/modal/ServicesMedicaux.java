package module.designpatterns.chuprojet.services.modal;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter
@NoArgsConstructor
public class ServicesMedicaux extends ChuService {
    public ServicesMedicaux(Long id) {
        super(id);
    }

    @Override
    public void servie() {
        System.out.println("service Medicaux served");
    }

    @Override
    public void update(String message) {
        System.out.println("service Medicaux update");
    }
}
