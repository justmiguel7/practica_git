package RepasoEvaluacion1erCuatrimestre;
import java.util.Arrays;
import java.util.Scanner;

public class RepasoEvaluacion1erCuatrimestre {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		System.out.println("Cantidad de DNIs: ");
		int cantidad = datos.nextInt();
		
		int[] DNI = new int[cantidad];

		for (int i = 0; i < DNI.length; i++) {
			System.out.println("Ingresar una lista de DNIs: ");
			DNI[i] = datos.nextInt();
			
		}

		System.out.println("\nDNI ordenado ascendente");
		Arrays.sort(DNI);
		for (int i = 0; i < DNI.length; i++) {
			System.out.println("DNI ASCENDENTE: " + DNI[i]);
		}
		
		String[] Apellidos = new String [cantidad];
		String Apellido;
		
		for (int j = 0; j < DNI.length; j++) {
			System.out.println("Completando los apellidos: ");
			Apellidos[j] = datos.next();
			
		}
		System.out.println("Ingrese un apellido para buscarlo:");
		Apellido = datos.next();
		
		boolean Ap = false;
		
		for (int j = 0; j < cantidad; j++) {
			
			if(Apellido == Apellidos[j]) {
				System.out.println("\nApellido: " + Apellidos[j]);
				System.out.println("Numero de DNI: " + DNI[j]);
				Ap = true;
			}
			
		}
		
}
}
