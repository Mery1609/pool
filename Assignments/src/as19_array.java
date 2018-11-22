import java.util.Arrays;
import java.util.Scanner;
public class as19_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array=readIntegers(5);
		int min=findMin(array);
		System.out.println(min);
	}
	
	public static int[] readIntegers(int count) {
		
		Scanner input = new Scanner(System.in);
		int[] myArray=new int[count];
		for(int i=0;i<count;i++) {
			System.out.println("Enter a number#"+ (i+1));
			int number=input.nextInt();
			myArray[i]=number;
		}
		input.close();
		return myArray;
	}
	
	public static int findMin(int[] array) {
		
		int min=array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		
		return min;
		
	}
	
}
