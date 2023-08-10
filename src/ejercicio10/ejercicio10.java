package ejercicio10;

import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		
		String nomb, apel;
		int numero;
		
		System.out.println("Nombre: ");
		nomb = entrada.next();
		
		System.out.println("Apellido: ");
		apel = entrada.next();
		
		System.out.println("Eliga un numero entre el 0 y 99: ");
		numero = entrada.nextInt();
		
		int numeroAleatorio = (int) (Math.random() * 99);
		
		if(numero==numeroAleatorio) {
			
		}
		System.out.println("Nombre: "+nomb);
		System.out.println("apellido: "+apel);
		System.out.println("numero aleatorio: "+numeroAleatorio);
		
		if(numero==numeroAleatorio) {
			System.out.println("El numero ingresado es igual al numero aleatorio");
		}
		
		else {
			System.out.println("El numero ingresado NO es igual al numero aleatorio");
		}
	}
}
