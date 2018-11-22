import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte counter=1;
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		while(counter<11) {
			System.out.println("Enter number #"+counter);
			boolean bool=scanner.hasNextInt();
			if(bool) {
				int number=scanner.nextInt();
				sum+=number;
				counter++;	
			}else {
				System.out.println("Invalid number");
				scanner.nextLine();
			}
		}
		System.out.println(sum);
		scanner.close();
	}

}
