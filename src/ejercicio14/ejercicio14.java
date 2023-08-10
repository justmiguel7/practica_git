package ejercicio14;

import java.util.Scanner;

public class ejercicio14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Ingrese un numero: ");
		numero = entrada.nextInt();
		
		if (numero > 0) {
			System.out.println("Se puede realizar la division ");
		}
		else {
			System.out.println("Nose se puede realizar la division ");
		}
	}

}
