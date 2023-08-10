package tp; /*nombre del paquete*/

import java.util.Scanner; /*libreria para el scanner*/

public class tp {

	public static void main(String[] args) {/* es la funcion principal */
		Scanner datos = new Scanner(System.in); /* sirve para ingresar datos */

		int num_raiz, num_signo, num_bingo, opc;/* Declaramos las varibles */

		System.out.println("\tEste programa te permite resolver algunos problemas"); /* el \t sirve para poner el texto en el centro */
		System.out.println("\tElige una opcion: ");
		System.out.println("1. Calcular raiz cuadrada.");
		System.out.println("2. Analizar si un numero es positivo, negativo o cero.");
		System.out.println("3. Jugar al bingo.\n");/* el \n sirve para dejar un renglon vacio */
		/*
		 * el System.out.println sirve para mostrar caracteres o numeros que son
		 * ingresados por el programador o en algunas ocaciones por el usuario
		 */

		opc = datos.nextInt(); /* esto sirve para que ingrese un caracter para que luego se guarde y se use */

		switch (opc) /* el switch sirve para mostrar casos segun la opcion que eliga el usuario */ {

		case 1: /* el case es uno de los casos que pueden ser elegidos */
			System.out.println("Ingresa un numero para calcular su raiz cuadrada: ");
			num_raiz = datos.nextInt();

			if (num_raiz >= 0) { /* el if sirve para mostrar algo si es que se cumple */
				int raiz_cuadrada = (int) Math.sqrt(num_raiz);
				System.out.println("El resultado es: " + raiz_cuadrada);
			} else { /*
						 * el else muestra algo que el los demas if y else if no puedan mostrar (por
						 * ejemplo, si el if pedia un numero positivo y pones uno negativo que no se
						 * puede resolver, en vez de mostrar el if muestra el else)
						 */
				System.out.println("No se puede calcular la raiz de un negativo.");
			}
			break; /*
					 * sirve para terminar el codigo, de lo contrario podria haber errores como que
					 * se muestre otro caso que no tenga nada que ver
					 */

		case 2:
			System.out.println("Ingresa un numero: ");

			num_signo = datos.nextInt();

			if (num_signo == 0) {
				System.out.println("El numero es cero");
			} else if (num_signo > 0) {/*
										 * es otra forma de poner un if, si es que el if no cumple una funcion y el else
										 * if si, este se mostrara
										 */
				System.out.println("El numero es positivo");
			} else {
				System.out.println("El numero es negativo");
			}

			break;

		case 3:
			System.out.println("Ingresa un numero entre 0 y 9");

			num_bingo = datos.nextInt();

			int num_ganador1 = (int) (Math.random()
					* 9);/*
							 * Math.random genera un numero aleatorio dependiendo del limite que le ponga el
							 * programador por ejemplo en este caso seria de 0 a 9
							 */
			int num_ganador = num_ganador1;

			if (num_bingo == num_ganador) {
				System.out.println("Ganaste!");
			} else {
				System.out.println("Perdiste");
				System.out.println("El numero ganador es: " + num_ganador);
			}
			break;

		default:/*
				 * El default sirve para en caso de que no se ingrese un valor correcto para el
				 * case, se mostrara este como para advertirle al
				 */
			System.out.println("Opcion incorrecta.");
			break;

		}
	}

}
