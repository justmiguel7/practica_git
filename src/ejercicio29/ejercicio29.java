package ejercicio29;

import java.util.Scanner;

public class ejercicio29 {
	public static void main(String[] args) throws InterruptedException{
		Scanner entrada = new Scanner(System.in);
		
		int bate;
		
		for ( bate = 100; bate >= 0;bate--) {
		Thread.sleep(200);
		System.out.println(bate +"%");
		
		if (bate == 20 ) {
			System.out.println("\nBateria baja ");
			Thread.sleep(1000);
		}
		}
		
		System.out.println("\nBateria agotada");
	}
}
