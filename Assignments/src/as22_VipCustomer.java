
public class as22_VipCustomer {

	private String name="AJ";
	private int creditLimit=8000;
	private String email="xxxxxxxxx@gmail.com";
	
	public as22_VipCustomer(String name, int creditLimit, String email) {
	
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	
	public as22_VipCustomer() {
	
	}
	
	public as22_VipCustomer(String name, int creditLimit) {
	
		this.name = name;
		this.creditLimit = creditLimit;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getCreditLimit() {
		return creditLimit;
	}
	
	public String getEmail() {
		return email;
	}

}
