package ejercicio35;

import java.util.Scanner;

public class ejercicio35 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int califAlta = 0, califBaja = 0, nota1, nota2, nota3, nota4, nota5, notasuma, notatotal;
		

			System.out.println("primera nota del alumno: ");
			nota1 = entrada.nextInt();
			
			System.out.println("segunda nota del alumno: ");
			nota2 = entrada.nextInt();

			System.out.println("tercera nota del alumno: ");
			nota3 = entrada.nextInt();

			System.out.println("cuarta nota del alumno: ");
			nota4 = entrada.nextInt();

			System.out.println("quinta nota del alumno: ");
			nota5 = entrada.nextInt();
	
	
	if (nota1 > nota2 && nota1 > nota3 && nota1 > nota4 && nota1 > nota5) {
		califAlta = nota1;
	}
	
	if (nota2 > nota1 && nota2 > nota3 && nota2 > nota4 && nota2 > nota5) {
		califAlta = nota2;
	}
	
	if (nota3 > nota2 && nota3 > nota1 && nota3 > nota4 && nota3 > nota5) {
		califAlta = nota3;
	}
	
	if (nota4 > nota2 && nota4 > nota3 && nota4 > nota1 && nota4 > nota5) {
		califAlta = nota4;
	}
	
	if (nota5 > nota2 && nota5 > nota3 && nota5 > nota4 && nota5 > nota1) {
		califAlta = nota5;
	}
	
	if (nota1 < nota2 && nota1 < nota3 && nota1 < nota4 && nota1 < nota5) {
		califBaja = nota1;
	}
	
	if (nota2 < nota1 && nota2 < nota3 && nota2 < nota4 && nota2 < nota5) {
		califBaja = nota2;
	}
	
	if (nota3 < nota2 && nota3 < nota1 && nota3 < nota4 && nota3 < nota5) {
		califBaja = nota3;
	}
	
	if (nota4 < nota2 && nota4 < nota3 && nota4 < nota1 && nota4 < nota5) {
		califBaja = nota4;
	}
	
	if (nota5 < nota2 && nota5 < nota3 && nota5 < nota4 && nota5 < nota1) {
		califBaja = nota5;
	}
	
	notasuma = nota1 + nota2 + nota3 + nota4 + nota5;
	notatotal = notasuma / 5;
	
	
	System.out.println("la nota alta es: " +califAlta);
	
	System.out.println("la nota alta es: " +califBaja);
	
	System.out.println("la nota promediada es: " +notatotal);
	}
		
	
	}
	