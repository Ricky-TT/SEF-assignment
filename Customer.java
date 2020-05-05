package rmit.sef.week8;

public class Customer {
	private String CId;
	private String Name;
	private String Email;
	public Customer(String cId, String name, String email) {
		super();
		CId = cId;
		Name = name;
		Email = email;
	}
	public String getCId() {
		return CId;
	}
	public String getName() {
		return Name;
	}
	public String getEmail() {
		return Email;
	}
	 
}
