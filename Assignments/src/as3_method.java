
public class as3_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printMegaBytesAndKiloBytes(2050);
	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes<0) {
			System.out.println("Invalid Value");
		}else {
			int kb=kiloBytes%1024;
			int mb=(kiloBytes-kb)/1024;
			System.out.println(kiloBytes+"KB = "+mb+" MB and "+kb+" KB");
			
		}	
	}

}
