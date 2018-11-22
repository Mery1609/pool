
public class as13_for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
		System.out.println(sumOdd(100, -100));
		System.out.println(sumOdd(100, 1000));
		
}
	
	public static boolean isOdd(int number) {
		
		if(number>0 && number%2==1) {
			return true;
		}else {
			return false;
		}
}

	public static int sumOdd(int start, int end) {
		int sum=0;
		if(end>=start && start>0) {
			for(int i=start;i<=end;i++) {
				if(isOdd(i)) {
					sum+=i;
				}
			}
			return sum;
		}else {
			return -1;
		}	
	}	
}
