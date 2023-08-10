package opermat;

import java.util.Scanner;

public class opermat {

	public static void main (String args []) {
		
		Scanner entrada = new Scanner (System.in);
		float num1, num2, num3, num4, suma, resta, multip, div, resto;
		
		System.out.println("\tOperaciones Matematicas");
		
		System.out.println("Escriba el primer numero: ");
		num1 = entrada.nextFloat();
		
		System.out.println("\nEscriba el segundo numero: ");
		num2 = entrada.nextFloat();
		
		System.out.println("\nEscriba el tercer numero: ");
		num3 = entrada.nextFloat();
		
		System.out.println("\nEscriba el cuarto numero: ");
		num4 = entrada.nextFloat();
		
		System.out.println("\nLos resultados, son: ");
		
		suma = num1+ num2; 
		resta = num3-num4;
		multip = num1*num2;
		div = num3/num4;
		resto = num3%num4;
		
		System.out.println("\nResultado de la suma entre el numero 1 y 2 es:"+suma);
		System.out.println("Resultado de la resta entre el numero 3 y 4 es:"+resta);
		System.out.println("Resultado de la multiplicacion entre el numero 1 y 2 es:"+multip);
		System.out.println("Resultado de la division entre el numero 3 y 4 es:"+div);
		System.out.println("El resto de la division entre el numero 3 y 4 es: "+resto);
		
	}
}
