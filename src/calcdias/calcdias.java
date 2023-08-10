



package calcdias;

import java.util.Scanner;

public class calcdias {

	public static void main (String args []) {

		Scanner entrada = new Scanner (System.in);
		float edad, dias, semanas, meses;
		
		System.out.println("\tCalculadora de edad en dias, semanas y años");
	
	
		
		System.out.println("lolol");
	
		System.out.println("Escribe la edad que deseas convertir: ");
		edad = entrada.nextFloat();
		
		System.out.println("\nLos resultados son: ");

		dias = edad*365;
		semanas = edad*52;
		meses = edad*12;
		
			System.out.println("dias= "+dias);
		    System.out.println("semanas="+semanas);
		    System.out.println("meses= "+meses);
}
}
