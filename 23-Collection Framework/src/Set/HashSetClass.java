package Set;

import java.util.*;

public class HashSetClass {

	public static void main(String[] args) {
		
		Set<Integer> values=new HashSet<Integer>();
		
		values.add(15);
		values.add(19);
		values.add(6);
		values.add(95);
		
		values.add(6);
		values.add(8);
		values.add(88);
		
		for(int i:values) {
			System.out.println(i);
		}
		
	}

}
