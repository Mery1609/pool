package computer;

public class PC {

	private Case theCase;
	private Monitor theMonitor;
	private motherBoard theMotherBoard;
	
	public PC(Case theCase, Monitor theMonitor, motherBoard theMotherBoard) {
		this.theCase = theCase;
		this.theMonitor = theMonitor;
		this.theMotherBoard = theMotherBoard;
	}

	public Case getTheCase() {
		return theCase;
	}

	public Monitor getTheMonitor() {
		return theMonitor;
	}

	public motherBoard getTheMotherBoard() {
		return theMotherBoard;
	}
	
	
	
}
