package ejercicio27;

import java.util.Scanner;

public class ejercicio27 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contraseña, contraseña2, intentos = 3;
		boolean correcto = false;

		System.out.println("ingrese su fecha de nacimiento como contraseña");
		contraseña = entrada.nextInt();
		System.out.println("\nintentos restantes " + intentos);

		do {

			System.out.println("ingrese la contraseña");
			contraseña2 = entrada.nextInt();

			
				intentos--;
			

			if (contraseña != contraseña2) {

				System.out.println("\ncontraseña incorrecta");
				System.out.println("intentos restantes: " + intentos);
				} else {
				System.out.println("\ncontraseña correcta");
				System.out.println("intentos restantes: " + intentos);
				correcto = true;
			}

		} while (intentos != 0 && correcto == false);
		System.out.println("\ngracias por usar el programa");

	}

}
