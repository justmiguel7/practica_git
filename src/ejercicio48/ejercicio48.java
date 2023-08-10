package ejercicio48;

import java.util.Scanner;

public class ejercicio48 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		String[] apellido = new String[4];
		
		for (int i = 0; i < apellido.length; i++) {
			System.out.println("Ingresar apellidos: ");
			apellido[i] = datos.next();
		}
		for (String palabra : apellido) {
			System.out.print(palabra + " ");
		}
		for (int i = 0; i < apellido.length - 1; i++) {
			for (int j = 0; j < apellido.length - i - 1; j++) {
				if(apellido[j].compareTo(apellido[j + 1]) > 0) {
					String pepe = apellido[j];
					apellido[j] = apellido[j + 1];
					apellido[j + 1] = pepe;
				}
			}
		}
		System.out.println("Apellidos ordenados:");
		for (String palabra : apellido) {
			System.out.print("\nApellidos ingresados: "+ palabra);
		}
		
		
}
}