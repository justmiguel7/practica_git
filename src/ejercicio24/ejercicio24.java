package ejercicio24;

import java.util.Scanner;

public class ejercicio24 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		char decision = 'd';
		boolean puedo_salir = false;
		
		do {
			System.out.println("Puedo salir? ");
			decision = datos.next().charAt(0);
			
			if (decision == 'S') {
				puedo_salir = true;
			}
			}while (decision != 'S' && puedo_salir == false);
		if (decision == 'S' && puedo_salir == true) {
			
			System.out.println("Gracias papu :v");
		}
			
		}
	}


