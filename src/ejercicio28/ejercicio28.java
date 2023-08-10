package ejercicio28;

import java.util.Scanner;

public class ejercicio28 {
	public static void main(String[] args) throws InterruptedException{
		Scanner entrada = new Scanner(System.in);
		
		int bate = 100;
		
		while (bate != 0) {
			System.out.println("Bateria: "+ bate+"%");
			bate--;
			Thread.sleep(200);
			
			if (bate == 20 ) {
				System.out.println("Bateria baja "+ bate+"%");
				Thread.sleep(1000);
			}
		}
		System.out.println("Bateria agotada");
	}
}
