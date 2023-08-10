package tppunto3;

import java.util.Scanner;

public class tppunto3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char Talle;
		int remeras, Vremeras = 5000, costo, VremerasMyL = 5500;
		double descuento, mult = 0.15, CostoT;
		
		System.out.println("Ingrese su talle: ");
		Talle = entrada.next().charAt(0);
		
		switch (Talle) {
		
		case 'S':
			System.out.println("Cuantas remeras desea comprar: ");
			remeras = entrada.nextInt();
			
			costo = remeras * Vremeras;
			
			if (remeras > 30) {
				System.out.println("No hay stock ");
			}
			else if (remeras >= 15 && remeras <= 30 ) {
				System.out.println("Usted a comprado: "+ remeras );
				descuento = costo * mult;
				CostoT = costo - descuento;
				System.out.println("Costo de la compra: "+ costo);
				System.out.println("Costo total con descuento su compra: "+ CostoT);
			}
			else {
				System.out.println("Usted a comprado: "+ remeras);
				System.out.println("Costo de la compra: "+ costo);
			}
		case 'M':
			System.out.println("Cuantas remeras desea comprar: ");
			remeras = entrada.nextInt();
			
			costo = remeras * VremerasMyL;
			
			if (remeras > 40) {
				System.out.println("No hay stock ");
			}
			else if (remeras >= 22 && remeras <= 40 ) {
				System.out.println("Usted a comprado: "+ remeras );
				descuento = costo * mult;
				CostoT = costo - descuento;
				System.out.println("Costo de la compra: "+ costo);
				System.out.println("Costo total con descuento su compra: "+ CostoT);
			}
			else {
				System.out.println("Usted a comprado: "+ remeras);
				System.out.println("Costo de la compra: "+ costo);
			}
		case 'L':
			System.out.println("Cuantas remeras desea comprar: ");
			remeras = entrada.nextInt();
			
			costo = remeras * VremerasMyL;
			
			if (remeras > 50) {
				System.out.println("No hay stock ");
			}
			else if (remeras >= 35 && remeras <= 50 ) {
				System.out.println("Usted a comprado: "+ remeras );
				descuento = costo * mult;
				CostoT = costo - descuento;
				System.out.println("Costo de la compra: "+ costo);
				System.out.println("Costo total con descuento su compra: "+ CostoT);
			}
			else {
				System.out.println("Usted a comprado: "+ remeras);
				System.out.println("Costo de la compra: "+ costo);
			}
		}
	}
}
