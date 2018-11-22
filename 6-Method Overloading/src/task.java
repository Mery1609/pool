public class task {

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		
		if(feet>=0 && inches>=0 && inches<=12) {
			double sum=feet*30.48 +(inches*2.54);
			System.out.println(feet+" feet, "+inches+" inches= "+sum+" centimetres");
			return feet*30.48 +(inches*2.54);
			
		}else {
			System.out.println("Invalid feet or inches");
			return -1;
		}
		
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches>=0) {
			double feet=(int)inches/12;
			double remainingInches=(int)inches%12;
			System.out.println(inches+" inches= "+feet+" feet and "+remainingInches+" inches");
			return calcFeetAndInchesToCentimeters(feet, remainingInches);
		}else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calcFeetAndInchesToCentimeters(6, 0);
		calcFeetAndInchesToCentimeters(-10, 0);
		calcFeetAndInchesToCentimeters(0, 1);
		calcFeetAndInchesToCentimeters(100);
		calcFeetAndInchesToCentimeters(156);
	}

}
