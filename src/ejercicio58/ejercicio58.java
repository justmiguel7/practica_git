package ejercicio58;

import java.util.Scanner;

public class ejercicio58 {

	static boolean positivo = false;
	static int n1;
	
	public static void IngNum() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresar un numero: ");
		n1 = entrada.nextInt();
	}
	public static int bandera(int b) {
		if (b >= 0) {
			positivo = true;
		}
		
		if (positivo == true) {
			System.out.println("El numero es positivo");
		}
		else {
			System.out.println("El numero es negativo");
		}
		return b;
		
	}
 
	public static void main (String [] args){
		IngNum();
		bandera(n1);
	}
}
