package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     int contraseņa, contraseņa2, intentos=3;
        
        System.out.println("ingrese su fecha de nacimiento como contraseņa");
        contraseņa = entrada.nextInt();
        System.out.println("\nintentos restantes "+intentos);
        
        do {
   
        System.out.println("ingrese la contraseņa");
        contraseņa2 = entrada.nextInt();
        
        if (contraseņa != contraseņa2) {
        	intentos--;
        }
        
        if (contraseņa != contraseņa2) {
        	
    		System.out.println("\ncontraseņa incorrecta"); 
    		System.out.println("intentos restantes: "+intentos);
   	}
        else {
        	System.out.println("\ncontraseņa correcta");
        	System.out.println("intentos: "+intentos);
        	intentos = 0;	
        }
   
        }while (intentos != 0); 
        	System.out.println("\ngracias por usar el programa");
        
     
        
        
	}
	
}

