package ejercicio59;

import java.util.Scanner;

public class ejercico59 {
	
	static int []cantidad = new int [3];
	static int maximo = -100, minimo = 100;
	public static void Ing (){
		Scanner entrada = new Scanner(System.in);
		for(int i = 0; i < cantidad.length; i++) {
			System.out.println("Ingrese el valor");
			cantidad[i] = entrada.nextInt();
			
			if (cantidad[i] > maximo) {
				maximo = cantidad[i];
			}
			
			if (cantidad[i] < minimo) {
				minimo = cantidad[i];
			}
		}
		
	}
	public static void resultado(){
		System.out.println("el valor maximo es: " +maximo);
		System.out.println("el valor minimo es: " +minimo);
	}
	public static void main (String [] args) {
		Ing();
		resultado();
	}
}

