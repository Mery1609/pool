
public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
displayHighScorePosition("Aj", calculateHighScorePosition(1500));
displayHighScorePosition("Aj", calculateHighScorePosition(900));
displayHighScorePosition("Aj", calculateHighScorePosition(400));
displayHighScorePosition("Aj", calculateHighScorePosition(50));

	}
	
	
	public static void displayHighScorePosition(String playersName,int position) {
		System.out.println(playersName+" managed to get into position: "+position+" on the high score table");
	}
	
	public static int calculateHighScorePosition(int score) {
		
		if(score>=1000) {
			return 1;
		}else if(score>=500 && score<1000) {
			return 2;
		}else if(score>=100 && score<500) {
			return 3;
		}else {
			return 4;
		}
	}
	
	
	
	
	
	
	
	

}
