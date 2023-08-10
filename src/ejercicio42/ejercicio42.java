package ejercicio42;

import java.util.Scanner;

public class ejercicio42 {
	public static void main(String[] args) throws InterruptedException{
		Scanner entrada = new Scanner(System.in);
		int numeroAleatorio = (int) (Math.random()*50), numero2=3;
		int [] numero = new int [3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Numero de intentos: "+numero2);
			System.out.println("Ingrese un numero: ");
			numero[i] = entrada.nextInt();
			
			if (numeroAleatorio == numero[i]) {
				i = 3;
				System.out.println("\nNumero Correcto!!!!!!!");
				
			
			}
			
			if (i != 3) {
				System.out.println("\nNumero incorrecto");
				numero2--;
			}
			
		}
		System.out.println("\nFin del programa");
	}
	
}
