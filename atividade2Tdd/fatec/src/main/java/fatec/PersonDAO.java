package fatec;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
	 private List<Person> database;

	    public PersonDAO() {
	        this.database = new ArrayList<>();
	    }

	    public void save(Person p) {
	        if (p != null) {
	            database.add(p);
	        }
	    }

	    public List<String> isValidToInclude(Person p) {
	        List<String> errors = new ArrayList<>();

	        if (p.getName() == null || p.getName().split(" ").length < 2 || !p.getName().matches("[a-zA-Z]+ [a-zA-Z]+")) {
	            errors.add("O nome deve ser composto por ao menos 2 partes e conter apenas letras.");
	        }

	        if (p.getAge() < 1 || p.getAge() > 200) {
	            errors.add("A idade deve estar no intervalo [1, 200].");
	        }

	        if (p.getEmails() == null || p.getEmails().isEmpty()) {
	            errors.add("O objeto Person deve ter pelo menos um objeto da classe Email associado.");
	        } else {
	            for (Email email : p.getEmails()) {
	                if (email == null || email.getName() == null || !email.getName().matches(".+@.+\\..+")) {
	                    errors.add("O email associado não é válido.");
	                    break; // Para no primeiro erro encontrado
	                }
	            }
	        }

	        return errors;
	    }
}
