package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     int contrase�a, contrase�a2, intentos=3;
        
        System.out.println("ingrese su fecha de nacimiento como contrase�a");
        contrase�a = entrada.nextInt();
        System.out.println("\nintentos restantes "+intentos);
        
        do {
   
        System.out.println("ingrese la contrase�a");
        contrase�a2 = entrada.nextInt();
        
        if (contrase�a != contrase�a2) {
        	intentos--;
        }
        
        if (contrase�a != contrase�a2) {
        	
    		System.out.println("\ncontrase�a incorrecta"); 
    		System.out.println("intentos restantes: "+intentos);
   	}
        else {
        	System.out.println("\ncontrase�a correcta");
        	System.out.println("intentos: "+intentos);
        	intentos = 0;	
        }
   
        }while (intentos != 0); 
        	System.out.println("\ngracias por usar el programa");
        
     
        
        
	}
	
}

