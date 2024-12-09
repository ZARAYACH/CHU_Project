
package module.designpatterns.chuprojet.Services;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ServiceUrgence extends Service {

    public ServiceUrgence(Long id) {
        super(id);
    }
}
