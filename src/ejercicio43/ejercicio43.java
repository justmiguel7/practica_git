package ejercicio43;

import java.util.Scanner;

public class ejercicio43 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int [] numero = new int [5];
	
	for(int i = 0; i < 5; i++) {
		System.out.println("Ingresar un numero: ");
		numero[i] = entrada.nextInt();
		
		if(numero[i] < 0) {
			continue;
		}
		else{ System.out.println(numero[i]);
		}
	}

}
}