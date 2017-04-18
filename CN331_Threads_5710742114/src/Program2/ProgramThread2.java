package Program2;
public class ProgramThread2 implements Runnable{
	private static int MAX_VALUE = 1000;
	private static int PLAYER_ALL = 16;
	public static int PLAYER_CM = 0;
	public static String[] PLAYER_WIN;
	public static void main(String[] args){
		String PlayerName ="";
		PLAYER_WIN = new String[PLAYER_ALL];
		for(int item = 1;item <= PLAYER_ALL;item++){
			PlayerName = "Thread"+item;
			ProgramThread2 pt2 = new ProgramThread2();
			Thread thread = new Thread(pt2,PlayerName);
			thread.start();
		}
	}
	public void run() {
		startGame();
	}
	public void startGame(){
		for(int CM=0;CM<=MAX_VALUE;CM++){
     		System.out.println(Thread.currentThread().getName()+" : "+CM);
		}
		PLAYER_WIN[PLAYER_CM]= (String) Thread.currentThread().getName();
		PLAYER_CM += 1;
		checkWinner();
	}
	public void checkWinner(){
		if(PLAYER_CM==PLAYER_ALL){
			int valueRating = 1;
			System.out.println("*---- The winner of the competition!! ----*");
			for(int itemPlayer = 0;itemPlayer<PLAYER_ALL;itemPlayer++){
		 		System.out.println("Winner "+valueRating+" : "+PLAYER_WIN[itemPlayer]);
		 		valueRating += 1;
			}
			System.out.println("*------------ END ------------*");
			System.exit(0);
		}
	}
}
