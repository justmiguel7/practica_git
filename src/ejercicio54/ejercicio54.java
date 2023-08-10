package ejercicio54;

import java.util.Scanner;

public class ejercicio54 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		String[][] TaTeTi = new String[3][3];
		int fila = 0, columna = 0;
		String simbolo, numero;
		
		//Ingreso de filas y columnas y tambien X o O
		for (int i = 0; i < TaTeTi.length; i++) {
			for (int j = 0; j < TaTeTi.length; j++) {
				System.out.println("Numero de la fila: ");
				fila = datos.nextInt();
				
				System.out.println("Numero de la columna: ");
				columna = datos.nextInt();
				
				System.out.println("Simbolo X o O: ");
				simbolo = datos.next();
				
				System.out.println("Posicion: ");
				TaTeTi[i][j] = datos.next();
				
				for (int k = 0; k < TaTeTi.length; k++) {
					for (int l = 0; l < TaTeTi[i].length; l++) {
						if (TaTeTi[k][l] != null) {
							TaTeTi[k][l] = simbolo;
						}
						System.out.print(TaTeTi[k][l] + " ");
									
			}
					System.out.println();
				}
			}
		}
	}
}

		
		
		
		//Mostrar resultado
		
	

