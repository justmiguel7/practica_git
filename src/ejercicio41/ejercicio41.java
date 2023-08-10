package ejercicio41;

import java.util.Scanner;

public class ejercicio41 {
	public static void main(String[] args) throws InterruptedException{
		Scanner datos = new Scanner(System.in);
		String[] nombres = {"Messi", "Maradona", "Aymar", "Gallardo", "Palermo", "Riquelme", "Vagoneta", "Eito", "Leybovich", "Raffo"};
		
		for (String nombres_almacenados : nombres) {
		Thread.sleep(100);
		System.out.println(nombres_almacenados);
		}
	}
}
