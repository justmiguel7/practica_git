package ejercicio8;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		float num, suma1, mult;
		
		
		System.out.println("Ingrese un un numero con dos decimales: ");
		num = entrada.nextFloat ();
		
		int potencia = (int) Math.pow (num,2);
		
		System.out.println(+potencia);
		
		int numeroAleatorio = (int) (Math.random() * 10);
		
		System.out.println(+numeroAleatorio);
		
		suma1 = potencia + numeroAleatorio;
		
		System.out.println(suma1);
		
		mult = suma1 * 7;
		
		System.out.println(mult);
		
		double raiz = Math.sqrt(mult);
		
		System.out.println("\nEl resultado final es: "+raiz);
		
	}
}
