package RepasoEvaluacion1erCuatrimestre2;

import java.util.Scanner;

public class RepasoEvaluacion1erCuatrimestre2 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);

		String[] ApellidosProp = { "Lucas", "Juan", "Alejandro"};
		int[] Edad = { 25, 21, 36};
		int[] DNIProp = { 47851906, 46989015, 47457735, 47375295 };

		String[] MarcaDelVeh�culo = { "Chevrolet", "Peugeot", "Renault" };
		String[] NombreDelModelo = { "Corsa", "208", "Sandero" };
		int[] A�oDelVehiculo = { 2018, 2021, 2022 };
		String[] Patente = { "AD178JK", "AD200RS", "AD202VW" };

		for (int i = 0; i < 4; i++) {
			System.out.println("El auto " + NombreDelModelo[i] + " del a�o " + A�oDelVehiculo[i] + " , " + Patente[i] + " pertenece a " + ApellidosProp[i] + " que tiene " + Edad[i] + " A�os y su DNI " + DNIProp[i]);
		 
		    
			if(A�oDelVehiculo[i] >= 2020 && Edad[i] >= 24) {
				System.out.println("requisitos: ");
				System.out.println("El auto " + NombreDelModelo[i] + " del a�o " + A�oDelVehiculo[i] + " , " + Patente[i] +  " pertenece a " + ApellidosProp[i] + " que tiene " + Edad[i] + " A�os y su DNI " + DNIProp[i]);
			}
			
		}
	}
}