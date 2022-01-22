package patterns.dao.view;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginFormEvent {

    private String name;
    private String password;

}
