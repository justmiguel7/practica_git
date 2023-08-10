package ejercicio55;

import java.util.Scanner;

public class ejercicio55 {
		
	static int n1;
	
	public static void inicio() {
		System.out.println("inserte el numero que desea elevar al cuadrado");
	}
	
	public static void numerosing() {
		Scanner entrada = new Scanner(System.in);
		n1 = entrada.nextInt();
		
	}
	public static float alCuadrado(float a) {
		float cuadrado = a * a;
		return cuadrado;
	}
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
	    inicio();
	    numerosing();
	    alCuadrado(n1);
	    System.out.println("El resultado de la suma es: " + alCuadrado(n1));
	    
	}
}
