package ejercicio6;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		float num;
		
		System.out.println("Ingrese su nota con decimales: ");
		num = entrada.nextFloat();
		
		int numRedondeado = (int) Math.round(num);
		
		System.out.println("tu nota redondeada es: " +numRedondeado);
	}
}
