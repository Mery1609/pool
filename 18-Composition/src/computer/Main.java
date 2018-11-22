package computer;

public class Main {

	public static void main(String[] args) {
		
		Dimensions theDimensions=new Dimensions(20,20,5);
		Case theCase=new Case("2208","Dell","240",theDimensions);
		motherBoard theMotherBoard=new motherBoard("BJ-200","ASUS",4,6,"v2.44");
		Monitor theMonitor=new Monitor("27 inch beast","Acer",27,new Resolution(2540,1440));
		
		PC thePC=new PC(theCase,theMonitor,theMotherBoard);
		
		thePC.getTheMonitor().drawPixelAt(112, 178, "blue");
		thePC.getTheMotherBoard().loadProgram("Windows 1.0");
		thePC.getTheCase().pressPowerButton();
		
		
	}

}
