package module.designpatterns.chuprojet.Services;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ServicesParamedicaux extends ChuService {

    public ServicesParamedicaux(Long id) {
        super(id);
    }

    @Override
    public void servie() {
        System.out.println("service Paramedicaux served");
    }

    @Override
    public void update(String message) {
        System.out.println("service Paramedicaux update");
    }
}
