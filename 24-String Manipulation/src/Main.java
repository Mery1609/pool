
public class Main {

	public static void main(String[] args) {
		
		//charAt(index)-returns char value for the particular index
		
		String str="   JavaScript ";
		System.out.println(str.charAt(3));
		
		//length()-returns string length
		System.out.println(str.length());
		
		//substring(int beginIndex)-return substring for given index
		System.out.println(str.substring(5));

		//substring(int beginIndex,int endIndex)-returns substring for 
		//given begin and end index
		System.out.println(str.substring(2, 6));
		
		//contains()-returns boolean after matching the sequence of the char value
		System.out.println(str.contains("va"));
		
		//equals(Object another)-checks the equality of string with the given object
		System.out.println(str.equals("JavaScript"));
		
		//isEmpty()-checks if the string is empty
		System.out.println(str.isEmpty());
		
		//concat(String str)-concatinates the specified string
		System.out.println(str.concat(" batch9"));
		
		//replace(char old, char new)-replaces all occurences of the specified char value
		System.out.println(str.replace("Script", ""));
		
		//equalsIgnoreCase(String another) - compares another string it doesnt checl for the case
		System.out.println(str.equalsIgnoreCase("javascript"));
		
		//split(String delimeter) - splitting based on that delimeter and returns an array
		String str2="JavaScript is the best batch ever";
		String[] myArray=str2.split(" ");
		for(String word:myArray) {
			System.out.println(word);
		}
		
		//indexOf() - returns the specified char value index
		System.out.println(str.indexOf("v"));
		
		//indexOf(String substring,int fromIndex) - returns specified substring index starting with given index
		System.out.println(str.indexOf('i',4));
		
		//toLowerCase() - returns a string in lowercase
		System.out.println(str.toLowerCase());
		
		//toUpperCase() - returns a string in uppercase
		System.out.println(str.toUpperCase());
		
		//trim() - removes beginning and ending spaces of this string
		System.out.println(str.trim());
		
	}

}
