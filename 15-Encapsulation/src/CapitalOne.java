
public class CapitalOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		bankingTask user=new bankingTask(1413432423, 7834.43, "AJ", "abc@gmail.com", 0000000000000);
		
		System.out.println(user.getCustomerName());
		System.out.println(user.getBalance());
		
		user.depositFunds(1200.34);
		System.out.println(user.getBalance());
		System.out.println(user.withdraw(9034.77));
		user.withdraw(5064.23);
		System.out.println(user.getBalance());
		
		
		
	}

}
