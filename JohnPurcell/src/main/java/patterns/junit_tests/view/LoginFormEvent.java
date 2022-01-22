package patterns.junit_tests.view;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginFormEvent {

    private String name;
    private String password;

}
