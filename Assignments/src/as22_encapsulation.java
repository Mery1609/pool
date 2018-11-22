
public class as22_encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		as22_VipCustomer c1=new as22_VipCustomer();
		
		System.out.println(c1.getName());
		System.out.println(c1.getCreditLimit());
		System.out.println(c1.getEmail());
		
		as22_VipCustomer c2=new as22_VipCustomer("Mike",100000,"yyyyy@gmail.com");
		
		System.out.println(c2.getName());
		System.out.println(c2.getCreditLimit());
		System.out.println(c2.getEmail());
		
		as22_VipCustomer c3=new as22_VipCustomer("Smith",120000);
		
		System.out.println(c3.getName());
		System.out.println(c3.getCreditLimit());
		System.out.println(c3.getEmail());
	}

}
