package ejercicio23;

import java.util.Scanner;

public class ejercicio23 {
	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, resultado;
		
		Thread.sleep(20);
		
		System.out.println("Ingrese el primer numero: ");
		n1 = entrada.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		n2 = entrada.nextInt();
		
		while (n1 != 0) {
		resultado = n1 + n2;
		System.out.println("el resultado es: "+resultado);
		
		System.out.println("ingrese el primer numero para otra suma");
		System.out.println("o ingrese el numero 0 para cerrar el programa");
		n1 = entrada.nextInt();
		
		if (n1 == 0) {
			System.out.println("gracias por usar el programa");
		}
		else if (n1 > 0){
		System.out.println("Ingrese el segundo numero: ");
		n2 = entrada.nextInt();
		}
	}

}
}