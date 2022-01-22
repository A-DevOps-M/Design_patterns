package patterns.dao.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Java Beans
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private int id;
    private String name;
    private String password;

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
