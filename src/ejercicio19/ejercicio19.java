package ejercicio19;

import java.util.Scanner;

public class ejercicio19 {
	
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cafe;
		
		System.out.println("Ingrese una opcion del 1 al 5: ");
		cafe = entrada.nextInt();
		
		switch (cafe){
			
		case 1:
			System.out.println("Cafe cortado ");
			break;
		case 2:
			System.out.println("Cafe latte ");
			break;
		case 3:
			System.out.println("Cafe solo ");
			break;
		case 4:
			System.out.println("Cafe Lagrima ");
			break;
		case 5:
			System.out.println("Salir del programa ");
			break;
		default:
			System.out.println("No existe esa opcion ");
			break;
		}
		
}
}
