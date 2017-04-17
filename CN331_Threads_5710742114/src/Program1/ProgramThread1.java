package Program1;
public class ProgramThread1{
	private static String [] FULL_NAME = {"Patipan Nakarin"};
	public static void main(String[] args) {
		Thread Thread1 = new Thread(new Runnable() {
			public void run(){
				System.out.println("Thread1"+" : "+FULL_NAME[0]);
	      	}
		});
		Thread Thread2 = new Thread(new Runnable() {
			public void run(){
				String textName = "";
				for(int item=FULL_NAME[0].length();item>0;item--){
					textName += FULL_NAME[0].charAt(item-1);
				}
				System.out.println("Thread2"+" : "+textName);
	      	}
		});
		Thread Thread3 = new Thread(new Runnable() {
			public void run(){
				char character;
				int asciiInt;
				int totalAscii = 0;
				for(int item=0;item<FULL_NAME[0].length();item++){
					character = FULL_NAME[0].charAt(item);
					if(character != ' '){
						asciiInt = (int) character;
						totalAscii += asciiInt;
					}
				}
				System.out.println("Thread3"+" : Total Ascii = "+totalAscii);
	      	}
		});
		Thread Thread4 = new Thread(new Runnable() {
			public void run(){
				char character;
				int totalChar = 0;
				for(int item=0;item<FULL_NAME[0].length();item++){
					character = FULL_NAME[0].charAt(item);
					if(character != ' '){
						totalChar += 1;
					}
				}
				System.out.println("Thread4"+" : Total Character = "+totalChar);
	      	}
		});
		Thread1.start();
		Thread2.start();
		Thread3.start();
		Thread4.start();
	}
}
