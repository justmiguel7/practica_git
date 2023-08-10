package ejercicio17;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 

		int num1, num2, num3;
		
		System.out.println("Ingrese el primer numero: ");
		num1 = entrada.nextInt();
		
		System.out.println("Ingrese el segujndo numero: ");
		num2 = entrada.nextInt();
		
		System.out.println("Ingrese el tercer numero: ");
		num3 = entrada.nextInt();
		
		if (num1 > num2 && num1 > num3 && num2 > num3) {
			System.out.println("el numero mayor es: "+num1);
			System.out.println("el segundo numero mayor es: "+num2);
			System.out.println("el numero de menor valor es: "+num3);
		}
		
		else if (num1 > num2 && num1 > num3 && num3 > num2) {
			System.out.println("el numero mayor es: "+num1);
			System.out.println("el segundo numero mayor es: "+num3);
			System.out.println("el numero de menor valor es: "+num2);
		}
		
		else if (num2 > num1 && num2 > num3 && num1 > num3) {
			System.out.println("el numero mayor es: "+num2);
			System.out.println("el segundo numero mayor es: "+num1);
			System.out.println("el numero de menor valor es: "+num3);
		}
		
		else if (num2 > num1 && num2 > num3 && num3 > num1) {
			System.out.println("el numero mayor es: "+num2);
			System.out.println("el segundo numero mayor es: "+num3);
			System.out.println("el numero de menor valor es: "+num1);
		}
		
		else if (num3 > num1 && num3 > num2 && num1 > num2) {
			System.out.println("el numero mayor es: "+num3);
			System.out.println("el segundo numero mayor es: "+num1);
			System.out.println("el numero de menor valor es: "+num2);
		}
		
		else if (num3 > num1 && num3 > num2 && num2 > num1) {
			System.out.println("el numero mayor es: "+num3);
			System.out.println("el segundo numero mayor es: "+num2);
			System.out.println("el numero de menor valor es: "+num1);
		}
	}
}
