package ejercicio44;

import java.util.Scanner;

public class ejercicio44 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int [] numero = new int [4];
		int resto = 0;
		
		for(int i = 0; i < 4; i++) {
			System.out.println("\nIngresar un numero: ");
			numero[i] = entrada.nextInt();
			
		    /*resto = numero[i] % 2;*/
			
		    if (numero[i] % 2 == 1) {
		    	continue;
		    	
		    }
		    
		    else {
			System.out.println(+numero [i]);
			
		    }
		}
}
}