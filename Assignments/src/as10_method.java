
public class as10_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);
	}
	
	public static void printYearsAndDays(long minutes) {
		
		if(minutes<0) {
			System.out.println("Invalid value");
		}else {
			
			long day=minutes/60/24;
			long finalDay=day%365;
			long year=(day-finalDay)/365;
			
			System.out.println(minutes+" min = "+year+" y and "+finalDay+" d");
			
		}
	
	}

}
