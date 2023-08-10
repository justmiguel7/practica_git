package ejercicio36;

import java.util.Scanner;

public class ejercicio36 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float dinero = 0, dineroganado = 0, dineromax = -10, dineromin = 100000, horamax = 0, horamin = 0;
		
		for (int hora = 8; hora <= 17; hora ++) {
			
			System.out.println("Dinero que gano a las "+hora+"hs:");
			dineroganado = entrada.nextInt();
			
			dinero = dinero + dineroganado;
			
			if (dineroganado > dineromax) {
				dineromax = dineroganado;
				horamax = hora;
			}
			if (dineroganado < dineromin) {
				dineromin = dineroganado;
				horamin = hora;
			}
			
			
		}
		
		System.out.println("dinero ganado: " +dinero +" pesos");
		System.out.println("Dinero maximo ganado en la hora: "+horamax);
		System.out.println("Dinero minimo ganado en la hora: "+horamin );
		
		
	}
	
}
