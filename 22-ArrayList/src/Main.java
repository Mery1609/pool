import java.util.Scanner;
public class Main {

	private static Scanner scanner=new Scanner(System.in);
	private static GroceryList groceryList=new GroceryList();
	
	public static void printInstructions() {
		System.out.println("0-to print instructions");
		System.out.println("1-to see grocery list");
		System.out.println("2-to add an item");
		System.out.println("3-to modify the grocery list");
		System.out.println("4-to remove the item");
		System.out.println("5-to search for item");
		System.out.println("6-to quit the app");
	}
	
	public static void addItem() {
		System.out.println("Enter the item you want to add");
		String item=scanner.nextLine();
		groceryList.addGroceryItem(item);
	}
	
	public static void modifyItem() {
		System.out.println("Enter position you want to modify");
		int position=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the item you want to replace the current with");
		String newItem=scanner.nextLine();
		groceryList.modifyGroceryItem(position-1, newItem);
	}
	
	public static void removeItem() {
		System.out.println("Enter position of item you want to remove");
		int position=scanner.nextInt();
		groceryList.removeGroceryItem(position-1);
	}
	
	public static void searchForItem() {
		System.out.println("Enter name of item you are looking for");
		String searchItem=scanner.nextLine();
		groceryList.findItem(searchItem);
	}
	
	public static void main(String[] args) {
		
		boolean quit=false;
		int choice=0;
		printInstructions();
		while(!quit) {
//			printInstructions();
			System.out.println("Enter your choice");
			choice=scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:	
				quit=true;
				System.out.println("Bye.");
				break;
			}
		}

	}

}
