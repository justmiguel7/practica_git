package ejercicio7;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("la nota que tendras en Laboratorio de Algoritmos es: ");

		int numeroAleatorio = (int) (Math.random() * 10);

		System.out.println("\n " + numeroAleatorio);

	}
}
