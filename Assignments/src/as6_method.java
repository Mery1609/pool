
public class as6_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(hasEqualSum(1, 1, 1));
		System.out.println(hasEqualSum(1, 1, 2));
		System.out.println(hasEqualSum(1, -1, 0));
	}
	
	public static boolean hasEqualSum(int first, int second, int third) {
		
		if(first+second==third) {
			return true;
		}else {
			return false;
		}
	}
}
