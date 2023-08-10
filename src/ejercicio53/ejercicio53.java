package ejercicio53;

import java.util.Scanner;

public class ejercicio53 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		int filas, columnas;
		String nombrebuscado;
		boolean busqueda = false;

		System.out.println("Numero de filas: ");
		filas = datos.nextInt();

		System.out.println("Numero de columnas: ");
		columnas = datos.nextInt();

		String[][] tabla = new String[filas][columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {

				System.out.println("Ingrese una serie de apellidos: " + i + " " + j + "\n");
				tabla[i][j] = datos.next();

			}
			System.out.println();
		}
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {

				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nIngrese el apellido que desea buscar: ");
		nombrebuscado = datos.next();
		
		boolean pepe = false;
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				
			if (tabla[i][j].equalsIgnoreCase(nombrebuscado))
				System.out.println("se encontro el apellido " + tabla[i][j]);
				pepe = true;
				break;
			
			}

		}

		if (pepe =! true) {
			System.out.println("no se encontro el apellido!!");
		}
	}
}