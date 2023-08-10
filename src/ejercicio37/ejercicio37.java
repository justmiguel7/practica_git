package ejercicio37;

import java.util.Scanner;

public class ejercicio37 {
	public static void main(String[] args) throws InterruptedException{
		Scanner entrada = new Scanner(System.in);
		
		for(char Letra = 'A'; Letra <= 'Z'; Letra++) {
			Thread.sleep(100);
			if (Letra == 'A' || Letra == 'E' || Letra == 'I' || Letra == 'O' || Letra == 'U')
			System.out.println("Vocal: "+Letra);
			
		}
	}
}
