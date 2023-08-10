package ejercicio39;

import java.util.Scanner;

public class ejercicio39 {
	public static void main(String[] args) throws InterruptedException{
		Scanner datos = new Scanner(System.in);
		String[] nombre = new String[11];
		int [] edad = new int [11];
		
		for (int i = 0; i < 11; i++) {
			System.out.println("Ingrese el nombre del jugador: ");
			nombre[i] = datos.next();
			
			System.out.println("Ingrese la edad del jugador: ");
			edad[i] = datos.nextInt();
		}
		
		Thread.sleep(50);
		
		for (int i = 0; i < 11; i++) {
		System.out.println("\nNombre del jugador: ");
		System.out.println(nombre[i]);
		System.out.println("\nEdad del jugador: ");
		System.out.println(edad[i]);
		}
	}
}
