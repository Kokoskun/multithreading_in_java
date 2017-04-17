package Program3;
import java.util.Random;
public class ProgramThread3{

	private static int SIZE_MATRIX = 24;
	private static int [][] MATRIX_A;
	private static int [][] MATRIX_B;
	private static int [][] MATRIX_C;
	public static void main(String[] args) {
		MATRIX_A = createMatrix();
		MATRIX_B = createMatrix();
		System.out.println("MATRIX A = ");
		showMatrix(MATRIX_A);
		System.out.println("MATRIX B = ");
		showMatrix(MATRIX_B);
		System.out.println("MATRIX A + MATRIX B = ");
		calculateMatrix(MATRIX_A,MATRIX_B);
		showMatrix(MATRIX_C);
	}
	private static void showMatrix(int[][] matrix){
		for(int itemY = 0;itemY < SIZE_MATRIX;itemY++){
			System.out.print("| ");
			for(int itemX = 0; itemX < SIZE_MATRIX;itemX++){
				if(matrix[itemX][itemY]<10){
					System.out.print("00"+matrix[itemX][itemY]+" ");
				}else if(matrix[itemX][itemY]<100){
					System.out.print("0"+matrix[itemX][itemY]+" ");
				}else{
					System.out.print(matrix[itemX][itemY]+" ");
				}
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println();
	}
	private static int[][] createMatrix(){
		Random rand = new Random();
		int[][] dataMatrix =  new int[SIZE_MATRIX][SIZE_MATRIX];
		for(int itemY = 0;itemY < SIZE_MATRIX;itemY++){
			for(int itemX = 0; itemX < SIZE_MATRIX;itemX++){
				dataMatrix[itemX][itemY] = rand.nextInt(100);
			}	
		}
		//Send Return Value All of Matrix
		return dataMatrix;
	}
	private static void calculateMatrix(int[][] MatrixA, int[][] MatrixB){
		MATRIX_C = new int[SIZE_MATRIX][SIZE_MATRIX];

		Thread Thread1 = new Thread(new Runnable() {
			public void run(){
				for(int itemY=0;itemY<3;itemY++){
					for(int itemX=0;itemX<SIZE_MATRIX;itemX++){
						MATRIX_C[itemY][itemX] = MatrixA[itemY][itemX] + MatrixB[itemY][itemX];
					}
				}
	      	}
		});
		Thread Thread2 = new Thread(new Runnable() {
			public void run(){
				for(int itemY=3;itemY<6;itemY++){
					for(int itemX=0;itemX<SIZE_MATRIX;itemX++){
						MATRIX_C[itemY][itemX] = MatrixA[itemY][itemX] + MatrixB[itemY][itemX];
					}
				}
			}
		});
		Thread Thread3 = new Thread(new Runnable() {
			public void run(){
				for(int itemY=6;itemY<9;itemY++){
					for(int itemX=0;itemX<SIZE_MATRIX;itemX++){
						MATRIX_C[itemY][itemX] = MatrixA[itemY][itemX] + MatrixB[itemY][itemX];
					}
				}
			}
		});
		Thread Thread4 = new Thread(new Runnable() {
			public void run(){
				for(int itemY=9;itemY<12;itemY++){
					for(int itemX=0;itemX<SIZE_MATRIX;itemX++){
						MATRIX_C[itemY][itemX] = MatrixA[itemY][itemX] + MatrixB[itemY][itemX];
					}
				}
			}
		});
		Thread Thread5 = new Thread(new Runnable() {
			public void run(){
				//Calculate in Y from 12 to 15
				for(int itemY=12;itemY<15;itemY++){
					for(int itemX=0;itemX<SIZE_MATRIX;itemX++){
						
						//Set value of Matrix A + B
						MATRIX_C[itemY][itemX] = MatrixA[itemY][itemX] + MatrixB[itemY][itemX];
					}
				}
			}
		});
		
		//Create Thread6
		Thread Thread6 = new Thread(new Runnable() {

			//Function Calculate of Thread6
			public void run(){
				
				//Calculate in Y from 15 to 18
				for(int itemY=15;itemY<18;itemY++){
					for(int itemX=0;itemX<SIZE_MATRIX;itemX++){
						
						//Set value of Matrix A + B
						MATRIX_C[itemY][itemX] = MatrixA[itemY][itemX] + MatrixB[itemY][itemX];
					}
				}
			}
		});
		
		//Create Thread7
		Thread Thread7 = new Thread(new Runnable() {

			//Function Calculate of Thread7
			public void run(){
				
				//Calculate in Y from 18 to 21
				for(int itemY=18;itemY<21;itemY++){
					for(int itemX=0;itemX<SIZE_MATRIX;itemX++){
						
						//Set value of Matrix A + B
						MATRIX_C[itemY][itemX] = MatrixA[itemY][itemX] + MatrixB[itemY][itemX];
					}
				}
			}
		});
		
		//Create Thread8
		Thread Thread8 = new Thread(new Runnable() {
			
			//Function Calculate of Thread8
			public void run(){
				
				//Calculate in Y from 21 to 24
				for(int itemY=21;itemY<24;itemY++){
					for(int itemX=0;itemX<SIZE_MATRIX;itemX++){
						
						//Set value of Matrix A + B
						MATRIX_C[itemY][itemX] = MatrixA[itemY][itemX] + MatrixB[itemY][itemX];
					}
				}
			}
		});
		
		//Start Thread1 
		Thread1.start();
		Thread2.start();
		Thread3.start();
		Thread4.start();
		Thread5.start();
		Thread6.start();
		Thread7.start();
		Thread8.start();
	}
}
