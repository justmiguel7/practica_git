package ejercicio51;
import java.util.Scanner;

public class ejercicio51 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		double [][] tabla = new double [2][2];
		
		tabla [0][0] = 3.45;
		tabla [0][1] = 7.85;
		tabla [1][0] = 8.45;
		tabla [1][1] = 4.07;
		
		 for (int i = 0; i < tabla.length; i++) {
	            for (int j = 0; j < tabla[i].length; j++) {
	            	
	                System.out.print(tabla[i][j] + "f ");
	            }
	            System.out.println();
		 }

		
}
}