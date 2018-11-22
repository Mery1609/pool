
public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumDigits(125));
		System.out.println(sumDigits(12345));
		
		
		
	}
	
	public static int sumDigits(int number) {
		
		if(number>=10) {
			
			int sum=0;
			
			do {
				int number2=number%10;
				number=number-number2;
				number=number/10;
				sum+=number2;
				
			}while(number>0);
			
			return sum;
			
		}else {
			return -1;
		}
		
		
	}
}



