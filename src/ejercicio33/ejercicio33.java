package ejercicio33;

import java.util.Scanner;

public class ejercicio33 {
	public static void main(String args[]) {
		Scanner datos = new Scanner(System.in);
		int edad;
		String nombre = null; 
		
		for (int i = 1; i <= 11; i++) {
			System.out.println("Nombre del jugador: ");
			nombre = datos.next();
			
			System.out.println("Edad: ");
			edad = datos.nextInt();

	}
		System.out.println("Nombre: "+nombre);
}
}
/* No se puede, porque no se puede poner mas de 1 dato en la misma variable; si se hace esto, se reemplazara lo que pusiste anteriormente*/
