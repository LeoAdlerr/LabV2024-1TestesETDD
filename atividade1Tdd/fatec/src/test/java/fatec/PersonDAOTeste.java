package fatec;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import org.junit.jupiter.api.Test;

public class PersonDAOTeste {

    @Test
    public void testIsValidToIncludeWithValidPerson() {
        PersonDAO personDAO = new PersonDAO();
        Person person = new Person(1, "John Doe", 30);
        person.addEmail(new Email(1, "john@example.com"));

        List<String> errors = personDAO.isValidToInclude(person);

        assertTrue(errors.isEmpty());
    }

    @Test
    public void testIsValidToIncludeWithInvalidName() {
        PersonDAO personDAO = new PersonDAO();
        Person person = new Person(1, "John", 30);
        person.addEmail(new Email(1, "john@example.com"));

        List<String> errors = personDAO.isValidToInclude(person);

        assertEquals(1, errors.size());
        assertEquals("O nome deve ser composto por ao menos 2 partes e conter apenas letras.", errors.get(0));
    }

    @Test
    public void testIsValidToIncludeWithInvalidAge() {
        PersonDAO personDAO = new PersonDAO();
        Person person = new Person(1, "John Doe", 0);
        person.addEmail(new Email(1, "john@example.com"));

        List<String> errors = personDAO.isValidToInclude(person);

        assertEquals(1, errors.size());
        assertEquals("A idade deve estar no intervalo [1, 200].", errors.get(0));
    }

    @Test
    public void testIsValidToIncludeWithNoEmail() {
        PersonDAO personDAO = new PersonDAO();
        Person person = new Person(1, "John Doe", 30);

        List<String> errors = personDAO.isValidToInclude(person);

        assertEquals(1, errors.size());
        assertEquals("O objeto Person deve ter pelo menos um objeto da classe Email associado.", errors.get(0));
    }

    @Test
    public void testIsValidToIncludeWithInvalidEmailFormat() {
        PersonDAO personDAO = new PersonDAO();
        Person person = new Person(1, "John Doe", 30);
        person.addEmail(new Email(1, "invalidemail.com"));

        List<String> errors = personDAO.isValidToInclude(person);

        assertEquals(1, errors.size());
        assertEquals("O email associado não é válido.", errors.get(0));
    }
}

