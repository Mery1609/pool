
public class as16_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(-22));
		
	}
	
	public static int getEvenDigitSum(int number) {
		
		if(number>0) {
			
			int sum=0;
			int temp=number;
			int even=0;
			
			while(temp>0) {
				
				even=temp%10;
				if(even%2==0) {
					sum+=even;
				}
				temp=temp/10;
				
			}
			return sum;
			
		}else {
			return -1;
		}
			
	}
	
}
