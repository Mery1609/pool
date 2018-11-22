import java.util.Scanner;
public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myIntArray=new int[10];
		
		myIntArray[0]=35;
		myIntArray[1]=30;
		
		
		int[] myIntArray2= {1,20,30,4,5};
		
		System.out.println(myIntArray[2]+"|"+myIntArray2[4]);
		
		System.out.println("--------------------");
		
		int[] myIntegers=getIntegers(5);
		System.out.println(getAverage(myIntegers));
		
		
		
		
	}
	
	//create a method - getIntegers
	
	public static int[] getIntegers(int number) {
		Scanner scanner=new Scanner(System.in);
		
		int[] newArray=new int[number];
		
		for(int i=0;i<newArray.length;i++) {
			System.out.println("Enter number");
			boolean bool=scanner.hasNextInt();
			
			if(bool) {
				int num=scanner.nextInt();
				newArray[i]=num;
			}else {
				scanner.nextLine();
				i--;
			}
			
		}
		scanner.close();
		return newArray;
		
	}
	
	//method
	
	public static double getAverage(int[] array) {
		
		double sum=0;
		double average;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		
		average=sum/array.length;
		
		return average;
		
		
	}
	
	
	
	

}
