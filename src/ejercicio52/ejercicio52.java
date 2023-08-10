package ejercicio52;

import java.util.Scanner;

public class ejercicio52 {
	public static void main(String[] args) {
		int[][] tabla = new int[2][2];
		int matriznegativa = 0;
		
		tabla[0][0] = 7;
		tabla[0][1] = -7;
		tabla[1][0] = 6;
		tabla[1][1] = 8;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {

				if (tabla[i][j] <= 0) {
					matriznegativa = tabla [i][j];
					continue;
				}

				else {
					System.out.print(tabla[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\nla matriz que no fue mostrada es: " );
		System.out.println(matriznegativa);
	}
}
