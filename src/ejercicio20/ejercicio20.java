package ejercicio20;

import java.util.Scanner;

public class ejercicio20 {
	
	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		int seguidores=0;
		
		while(seguidores !=100) {
			System.out.println("n° de seguidores: "+seguidores);
			Thread.sleep(20);
			
			seguidores++;
	
			
			if (seguidores == 100 ) {
				System.out.println("Se alcanzaron los 100 seguidores! tu mama es hombre!");
			}
		}
	}

}
