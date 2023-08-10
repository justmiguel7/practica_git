package ejercicio30;

import java.util.Scanner;

public class ejercicio30 {
	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		
		int seguidores;
		
		for ( seguidores = 0; seguidores <= 100;seguidores++) {
			Thread.sleep(20);
			System.out.println("n° de seguidores: "+seguidores);
			
			if (seguidores == 100 ) {
				System.out.println("Se alcanzaron los 100 seguidores! tu mama es hombre!");
			}
			}
}
}