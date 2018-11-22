
public class EncapsulationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car porsche=new Car();
		
		porsche.setModel("911");
		String model=porsche.getModel();
		System.out.println(model);
		
		System.out.println("---------------------");
		
		OzzyEncapsulation mikeAccount=new OzzyEncapsulation();
		mikeAccount.setAccountNumber("1234567898765432");
		mikeAccount.setBalance(2.5);
		mikeAccount.setCustomerName("mike");
		
		mikeAccount.withdrawal(100.0);
		
		mikeAccount.deposit(150.000);
		mikeAccount.withdrawal(50.00);
		
		System.out.println(mikeAccount.getCustomerName());
		
	}

}
