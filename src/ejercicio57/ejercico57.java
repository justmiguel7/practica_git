package ejercicio57;

import java.util.Scanner;

public class ejercico57 {
	
	static float n1;
	static int n2;
	
	public static void NumIng() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresar un numero flotante");
		n1 = entrada.nextFloat();
	}
	
	public static float fraccion (float a) {
		int caca = (int) a;
		float resultado = a - caca;
		return resultado;
		
	}
	
	
	public static void main (String [] args) {
		NumIng();
		fraccion(n1);
		System.out.println("so " +"parte fraccionaria"+ fraccion(n1));
	}

}
