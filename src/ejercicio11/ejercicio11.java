package ejercicio11;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        
        System.out.println("ingrese un numero positivo o negativo: ");
		numero = entrada.nextInt();
		
		if (numero > 0) {
			System.out.println("el numero ingresado es positivo");
			
		}

		else if (numero == 0) {
			System.out.println("el numero es cero");
			
		}
		
		else {
			System.out.println("el numero ingresado es negativo");
			
		}
		
	}
}
