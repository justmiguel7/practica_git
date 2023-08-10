package raizcuadrada;

import java.util.Scanner;

public class raizcuadrada {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int numero;
		float resultado;
		
		System.out.println("Ingrese un numero: ");
		numero = entrada.nextInt();
		
		float raiz_Cuadrada = (float) Math.sqrt(numero);
		
		resultado = raiz_Cuadrada;
		
		System.out.println("El resultado es: "+resultado);
	}

}
