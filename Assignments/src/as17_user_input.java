import java.util.Scanner;
public class as17_user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int maximum=0;
		int minimum=0;
		while(true) {
			System.out.println("Enter number");
			boolean bool=input.hasNextInt();
			if(bool) {
				int integer=input.nextInt();
				if( maximum<integer) {
				
				maximum=integer;}
				if(minimum>integer) {
					minimum=integer;
				}
			}else {
				input.nextLine();
				System.out.println(maximum);
				System.out.println(minimum);
				input.close();
				break;
			}
				
		}
		
	}

}
