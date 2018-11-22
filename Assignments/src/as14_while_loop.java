
public class as14_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
		System.out.println(isPalindrome(1234321));
	}
	
	public static boolean isPalindrome(int number) {
		
		int reverse=0;
		int tempNumb=number;
		while(tempNumb!=0) {
		int lastDigit=tempNumb%10;
		reverse=reverse*10+lastDigit;
		tempNumb=tempNumb/10;
		}
		
		System.out.println(reverse);
		
		if(number==reverse) {
			return true;
		}else {
			return false;
		}	
	}
}
