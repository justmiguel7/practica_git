package ejercicio46;

import java.util.Scanner;

public class ejercicio46 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String[] nombre = {"Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana"};
		int[] numSocio = {1011, 2367, 8748, 9121, 817, 6423, 2034};
		int numAsociado;
		
		System.out.println("Ingrese numero de socio: ");
		numAsociado = entrada.nextInt();
		
		for(int i = 0; i < 7; i++) {
			
			if(numAsociado % 2 == 0) {
				continue;
			}
			if(numAsociado == numSocio[i]) {
				System.out.println("Socio: " +nombre [i]);
				System.out.println("Numero de Socio: " +numSocio [i] );
			}
			
		}
}
}