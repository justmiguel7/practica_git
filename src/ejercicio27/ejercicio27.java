package ejercicio27;

import java.util.Scanner;

public class ejercicio27 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contraseņa, contraseņa2, intentos = 3;
		boolean correcto = false;

		System.out.println("ingrese su fecha de nacimiento como contraseņa");
		contraseņa = entrada.nextInt();
		System.out.println("\nintentos restantes " + intentos);

		do {

			System.out.println("ingrese la contraseņa");
			contraseņa2 = entrada.nextInt();

			
				intentos--;
			

			if (contraseņa != contraseņa2) {

				System.out.println("\ncontraseņa incorrecta");
				System.out.println("intentos restantes: " + intentos);
				} else {
				System.out.println("\ncontraseņa correcta");
				System.out.println("intentos restantes: " + intentos);
				correcto = true;
			}

		} while (intentos != 0 && correcto == false);
		System.out.println("\ngracias por usar el programa");

	}

}
