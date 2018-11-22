
public class as23_printer {

	private int tonerLevel;
	private int numberOfPagesPrinted;
	private String type;
	
	public as23_printer(int tonerLevel, int numberOfPagesPrinted, String type) {
		this.tonerLevel = tonerLevel;
		this.numberOfPagesPrinted = numberOfPagesPrinted;
		this.type = type;
	}
	
	public int getTonerLevel() {
		return tonerLevel;
	}

	public void setTonerLevel(int tonerLevel) {
		if(this.tonerLevel<tonerLevel) {
			this.tonerLevel = tonerLevel;
		}
		System.out.println("Printer toner filled up to "+this.tonerLevel+"%");
	}

	public int getNumberOfPagesPrinted() {
		return numberOfPagesPrinted;
	}

	public void setNumberOfPagesPrinted(int numberOfPagesPrinted) {
		this.numberOfPagesPrinted = numberOfPagesPrinted;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void printingPage(int number) {
		
			for(int i=1;i<=number;i++) {
				System.out.println("Printing page number: "+i);
				this.tonerLevel--;
				if(this.tonerLevel<=0) {
					System.out.println("Fill up Toner to continue printing");
					break;
				}
			}
			System.out.println("Printer toner level is: "+this.tonerLevel+"%");
		
	}

}
