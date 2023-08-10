package ejercicio9;

import java.util.Scanner;

public class ejercicio9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nomb, apel;
		
		System.out.println("Nombre: ");
		nomb = entrada.next();
		
		System.out.println("Apellido: ");
		apel = entrada.next();
		
		int numeroAleatorio = (int) (Math.random() * 99);
		
		System.out.println("Nombre: "+nomb);
		System.out.println("apellido: "+apel);
		System.out.println("numero: "+numeroAleatorio);
	}
}