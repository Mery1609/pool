
public class OzzyEncapsulation {

	private String accountNumber;
	private double accountBalance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	public void deposit(double depositAmount) {
		
		this.accountBalance+=depositAmount;
		
	}
	
	public void withdrawal(double withdrawalAmount) {
		if(this.accountBalance-withdrawalAmount<0) {
		System.out.println("Only "+this.accountBalance+" is available. Withdrawal not processed");	
		}else {
			this.accountBalance-=withdrawalAmount;
			System.out.println("Withdrawal of "+withdrawalAmount+" processed. Remaining balance: "+this.accountBalance);
		}
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return accountBalance;
	}
	
	public void setBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}
	
	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}
	
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	
	
	
	
	
	
	
	
	
}
