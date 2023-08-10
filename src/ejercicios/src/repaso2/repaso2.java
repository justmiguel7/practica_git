package repaso2;

import java.util.Scanner;

public class repaso2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] nombre = { "pepe", "eso tilin", "ete sech" };
		int[] edad = { 40, 26, 32 };
		int[] dni = { 40315567, 50841552, 42531959 };

		String[] marca = { "Chevrolet", "Peugeot", "Renault" };
		String[] modelo = { "Corsa", "208", "Sandero" };
		int[] ano = { 2018, 2021, 2022 };
		String[] patente = { "AD178JK", "AD200RS", "AD202VW" };

		for (int i = 0; i < 3; i++) {

			if (ano[i] > 2020) {
				System.out.println("el auto " + marca[i] + ", modelo " + modelo[i] + ", del anio " + ano[i]
						+ " con patente" + patente[i] + " pertenece a " + nombre[i]);
			}
		}
	}
}