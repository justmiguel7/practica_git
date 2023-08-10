package ejercicios.src.repaso;

import java.util.Scanner;

public class repaso {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Inserte la cantidad de dni que va a usar");
		int cantidad = entrada.nextInt();

		int[] dni = new int[cantidad];

		for (int i = 0; i < dni.length; i++) {

			System.out.println("inserte un dni");
			dni[i] = entrada.nextInt();

		}

		for (int i = 0; i < (dni.length - 1); i++) {

			for (int j = 0; j < (dni.length - i - 1); j++) {

				if (dni[j] > dni[j + 1]) {

					int temporal = dni[j];

					dni[j] = dni[j + 1];

					dni[j] = temporal;
				}
			}
		}

		for (int i = 0; i < (dni.length); i++) {

			System.out.println("el dni " + (i + 1) + " es: " + dni[i] + "\n");
		}

		String[] apellido = new String[cantidad];
		for (int i = 0; i < (apellido.length); i++) {
			System.out.println("ingrese el apellido del dni " + (i + 1));
			apellido[i] = entrada.next();
		}

		System.out.println("que dni desea buscar?");
		int dni_buscado = entrada.nextInt();

		boolean busqueda = false;

		for (int i = 0; i < dni.length; i++) {
			if ((dni_buscado) == dni[i]) {

				System.out.println("el dni " + dni_buscado + " pertenece a: " + apellido[i]);
				busqueda = true;
				break;
			}
		}

		if (busqueda == false) {
			System.out.println("el dni " + dni_buscado + " no pertenece a nadie");

		}

	}
}