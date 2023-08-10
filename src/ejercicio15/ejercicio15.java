package ejercicio15;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int costoT;
		double descuento, mult=0.10, totalD;
		
		System.out.println("Costo total de la compra: ");
		costoT = entrada.nextInt();
		
		if (costoT >= 15000) {
		    descuento = costoT*mult;
		    
		totalD = costoT - descuento;
		    
			System.out.println("el costo total con el descuento es: " +totalD);
		}
		
		else {
			System.out.println("el costo total es: " +costoT);
		}
	}
}
