
public class as15_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumFirstAndLastDigit(252));
		System.out.println(sumFirstAndLastDigit(257));
		System.out.println(sumFirstAndLastDigit(0));
		System.out.println(sumFirstAndLastDigit(5));
		System.out.println(sumFirstAndLastDigit(-10));
	}

	public static int sumFirstAndLastDigit(int number) {
		
		int last=number%10;
		int first=number;
		if(number>=0) {
			
			do{
				if(first<10) {
					break;
				}
				first=first/10;
				
			}while(first>10);
			
			int sum=first+last;
			
			return sum;
			
		}else {
			return -1;
		}
	}	
}
