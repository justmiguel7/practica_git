package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     int contraseña, contraseña2, intentos=3;
        
        System.out.println("ingrese su fecha de nacimiento como contraseña");
        contraseña = entrada.nextInt();
        System.out.println("\nintentos restantes "+intentos);
        
        do {
   
        System.out.println("ingrese la contraseña");
        contraseña2 = entrada.nextInt();
        
        if (contraseña != contraseña2) {
        	intentos--;
        }
        
        if (contraseña != contraseña2) {
        	
    		System.out.println("\ncontraseña incorrecta"); 
    		System.out.println("intentos restantes: "+intentos);
   	}
        else {
        	System.out.println("\ncontraseña correcta");
        	System.out.println("intentos: "+intentos);
        	intentos = 0;	
        }
   
        }while (intentos != 0); 
        	System.out.println("\ngracias por usar el programa");
        
     
        
        
	}
	
}

