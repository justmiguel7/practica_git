package ejercicio16;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		
		int hora, minutos, segundos; 
		
		System.out.println("Ingrese la hora: ");
		hora = entrada.nextInt();
		
		System.out.println("Ingrese los minutos: ");
		minutos = entrada.nextInt();
		
		System.out.println("Ingrese los segundos: ");
		segundos = entrada.nextInt();
		
		if (hora > 24 || hora < 0 && minutos > 60 || minutos < 0 && segundos > 60 || segundos < 0) {
		System.out.println("ingrese los valores correctamente");
		}
		
		else {
			System.out.println("horas: "+hora);
			System.out.println("minutos: "+minutos);
			System.out.println("segundos: "+segundos);
			
		}
		
	}
}
