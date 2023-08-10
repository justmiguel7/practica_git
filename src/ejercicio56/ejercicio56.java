package ejercicio56;

import java.util.Scanner;

public class ejercicio56 {
	
	static String nombre, apellido;
	static int n1, n2;
	
	public static void ingnombre_apellido() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nombre del alumno: ");
		nombre = entrada.next();
		System.out.println("Apellido del alumno: ");
		apellido = entrada.next();
		
	}
	
	public static void asistenciasyclases () {
		 Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresar las asistencias");
		n1 = entrada.nextInt();
		System.out.println("Ingresar las clases totales");
		n2 = entrada.nextInt();

	}
	
		
	
	public static float porcentajeAsistencias (float a, float b) {
		float porcentajeAsistencias = (a / b) * 100;
		return porcentajeAsistencias;
		
	}
		
	
	public static void main (String [] args) {
		 Scanner entrada = new Scanner(System.in);
		 ingnombre_apellido();
		 asistenciasyclases();
		 porcentajeAsistencias(n1, n2);
			System.out.println("El resultado es: "+ porcentajeAsistencias(n1, n2));

		
	}
	
	
	
	
	
}

		

