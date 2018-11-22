
public class CalculateInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2;i<6;i++) {
			System.out.println(calculateInterest(10000, i));
		}
		
		
		
	}
	
	public static double calculateInterest(double amount,double interestRate) {
		return amount*(interestRate/100);
	}
	
	
	
	

}
