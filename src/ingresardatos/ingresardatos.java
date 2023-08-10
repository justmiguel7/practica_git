package ingresardatos;

import java.util.Scanner;

public class ingresardatos {

	public static void main (String args []) {
		
		Scanner entrada = new Scanner (System.in);
		
		String nombre1;
		int edad;
		
		System.out.println("\t Ingresa tu nombre:");	
		nombre1 = entrada.next();
		
		System.out.println("\n Ingresar tu edad:");	
		edad = entrada.nextInt();
		
		System.out.println("\nTu nombre es: "+nombre1);
		System.out.println("Tu edad es: "+edad);
	    }
	}
	
	

