import java.util.Arrays;
import java.util.Scanner;

public class as18_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array=getIntegers(10);
		printArray(array);
		sortIntegers(array);
		printArray(sortIntegers(array));
		
	}
	
public static int[] getIntegers(int count) {
		
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

public static void printArray(int[] array) {
	System.out.println(Arrays.toString(array));
}

public static int[] sortIntegers(int[] array) {
	
	   int temp;
	   for (int i = 1; i < array.length; i++) {
	    for (int j = i; j > 0; j--) {
	     if (array[j] > array [j - 1]) {
	      temp = array[j];
	      array[j] = array[j - 1];
	      array[j - 1] = temp;
	     }
	    }
	   }
	  
	     return array;
}

}
