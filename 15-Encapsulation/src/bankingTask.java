
public class bankingTask {

	private int accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private int phoneNumber;
	
	
	
	public bankingTask(int accountNumber, double balance, String customerName, String email, int phoneNumber) {
		
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public  double depositFunds(double amount) {
		
		if(amount>0) {
			return this.balance=balance+amount;
		}else {
			return this.balance;
		}
		
	}
	
	public double withdraw(double amount) {
		if(amount>=this.balance) {
			System.out.println("Amount exceeds your balance please try lower amount");
			return this.balance;
		}else {
			return this.balance=balance-amount;
		}
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
