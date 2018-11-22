
public class as8_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getDurationString(123, 55));
		System.out.println(getDurationString(78034));
	}
	
	public static String getDurationString(int minutes,int seconds) {
		
		if(minutes>=0 && seconds>=0 && seconds<=59) {
			int second=seconds%60;
			int tempMin=minutes+((seconds-second)/60);
			int finalMin=tempMin%60;
			int hour=(tempMin-finalMin)/60;
			return hour+"h "+finalMin+"m "+second;
		}else {
			return "Invalid value";
		}
	}
	
	public static String getDurationString(int seconds) {
		
		if(seconds>=0) {
			int secondsss=seconds%60;
			int minutesss=(seconds-secondsss)/60;
			return getDurationString(minutesss, secondsss);
		}else {
			return "Invalid Value";
		}
		
	}

}
