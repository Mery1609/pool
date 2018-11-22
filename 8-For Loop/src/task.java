
public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte counter=0;
		int sum=0;
		
		
		for(int i=1;i<=1000;i++) {
			
			if(i%3==0 && i%5==0) {
				sum+=i;
				counter++;
			}
			
			if(counter==5) {
				break;
			}
			
			
		}
		
		System.out.println(sum);
		
		
		
	}

}
