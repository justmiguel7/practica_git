package ejercicio31;

import java.util.Scanner;

public class ejercicio31 {
	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		int i;
		
		for ( i = 1; i <= 100; i++) {
			Thread.sleep(200);
			if(i <= 100) {
				Thread.sleep(200);
				System.out.println("Te quiero "+ i);
			}
		}
}
}