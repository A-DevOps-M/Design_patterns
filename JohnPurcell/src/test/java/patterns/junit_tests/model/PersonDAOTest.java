package patterns.junit_tests.model;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class PersonDAOTest {

    @BeforeAll
    static void setUpBeforeAll() throws Exception {
        Database.getInstance().connect();
    }

    @AfterAll
    static void setUpAfterAll() throws Exception {
        Database.getInstance().disconnect();
    }

    @BeforeEach
    void setUp() throws Exception{
        PersonDAO dao = DAOFactory.getPersonDAO();
        dao.deleteAll();
    }

    @Test
    void testAddPerson() throws SQLException{
        PersonDAO dao = DAOFactory.getPersonDAO();
        Person bob = new Person("Bob", "123456");
        Person jos = new Person("Jos", "123456");
        dao.addPerson(bob);
        dao.addPerson(jos);

        List<Person> people = dao.getPeople();
        assertEquals(2, people.size());
        assertEquals(bob.getName(), people.get(0).getName());
        assertEquals(jos.getName(), people.get(1).getName());
    }

}