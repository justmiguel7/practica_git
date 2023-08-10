package EvaluacionDeCachi;

import java.util.Arrays;
import java.util.Scanner;

public class EvaluacionDeCachi {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		int hora = 10 , producido = 0, prodMax = -10, prodMin = 100000;
		int [] produccion = new int [33];
		
		for(int a = 10; a <16; a+=2) {
			//puse 10 porque recien abren y 16 para que llegue a 14 hs//
			System.out.println("Cuantos sanguches se producieron a las:"+a+"hs");
			produccion[a] = datos.nextInt();
			
			producido = producido + produccion[a];
			
			if(produccion[a] > prodMax) {
				prodMax = produccion[a];
			}
			if(produccion[a] < prodMin) {
				prodMin = produccion[a];
			}
		}
		//ordenado Ascendente mente
		Arrays.sort(produccion);
		for (int i = 0; i < produccion.length; i++) {
			if(produccion[i]>0){
			System.out.println("Produccion ordenada: " + produccion[i]);
			}
			
		}
		System.out.println("");
		//Menor e igual a 20//
		for ( int j = 0; j < produccion.length; j++) {
			
			if(produccion[j] <= 20) {
				continue;
			}
			else {
				System.out.println("Produccion menor e igual a 20: "+produccion[j]);
			}
		}
		System.out.println("Produccion Maxima: "+prodMax);
		System.out.println("Produccion Minima: "+prodMin);
		
		
}
}