package ejercicio12;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Ingresa tu nota");
		nota = entrada.nextInt();
		
		if (nota <= 0 || nota > 10) {
			System.out.println("Ingresar una nota correcta");
		}
			
		
		else if (nota >= 1 && nota <= 3) {
		System.out.println("insuficiente");
		}
		
		else if (nota >= 4 && nota <= 5) {
		System.out.println("no logrado");
		}
		
		else if (nota >= 6 && nota <= 7) {
		System.out.println("suficiente");
		}
	
		else if (nota >= 8 && nota <= 9) {
		System.out.println("notable");
		}

		else if (nota == 10) {
		System.out.println("sobresaliente");
		}
	}
}
