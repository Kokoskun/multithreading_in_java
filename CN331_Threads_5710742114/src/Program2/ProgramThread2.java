package Program2;

public class ProgramThread2 implements Runnable{
	private static int MAX_VALUE = 100;
	private static int PLAYER_ALL = 16;
	public static int PLAYER_CM = 0;
	public static String[] PLAYER_WIN;
	public static void main(String[] args) {
		String PlayerName ="";
		PLAYER_WIN = new String[PLAYER_ALL];
		for(int item = 1;item <= PLAYER_ALL;item++){
			PlayerName = "Thread"+item;
			ProgramThread2 pt1 = new ProgramThread2();
			Thread thread = new Thread(pt1,PlayerName);
			thread.start();
		}
	}
	@Override
	public void run() {
		startGame();
	}
	public void startGame(){
		for(int CM=0;CM<=MAX_VALUE;CM++){
     		System.out.println(Thread.currentThread().getName()+" : "+CM);
		}
		PLAYER_WIN[PLAYER_CM]= (String) Thread.currentThread().getName();
		PLAYER_CM += 1;
	}
}
