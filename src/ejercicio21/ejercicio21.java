package ejercicio21;

import java.util.Scanner;

public class ejercicio21 {
	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		int temperatura = 35;
		
		while(temperatura <= 100) {
			System.out.println("La temperatura es: " +temperatura);
			
			if (temperatura < 85 || temperatura >= 86) {
			Thread.sleep(20);
			}
			
			if (temperatura == 85) {
			Thread.sleep(1000);
			}
			
			temperatura+=2;
		
			
			if(temperatura == 85) {
				System.out.println("\nCUIDADO!, TEMPERATURA PELIGROSA");
			}
		
		}
		
		System.out.println("\nVALOR EXTREMO APAGANDO PC\n");
	}

}
