package ejercicio18;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		char talle;

		System.out.println("Ingrese su talle de remera: ");
		talle = entrada.next().charAt(0);

		switch (talle) {

		case 'S':
			System.out.println("Quedan 5 remeras ");
			break;

		case 's':
			System.out.println("Quedan 5 remeras ");
			break;

		case 'M':
			System.out.println("Quedan 2 remeras ");
			break;

		case 'm':
			System.out.println("Quedan 2 remeras ");
			break;

		case 'L':
			System.out.println("No quedan remeras ");
			break;

		case 'l':
			System.out.println("No quedan remeras ");
			break;

		default:
			System.out.println("No existe ese talle salamin");
			break;
		}

		System.out.println("Gracias por usar el programa");
	}
}
