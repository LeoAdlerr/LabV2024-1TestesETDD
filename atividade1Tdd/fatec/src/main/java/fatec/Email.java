package fatec;

public class Email {
	private int id;
    private String name;
    private Person person;

    public Email(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return this.person;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    

}
