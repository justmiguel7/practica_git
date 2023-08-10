/*Consigna ctrl + shift + f
 Se le da un programa a un empleado administrativo para que ingrese �, los datos de 5 estudiantes.

 Para lo solicitado anteriormente, arm� el algoritmo con estas caracter�sticas:

1 Se le solicita que ingrese el n�mero de legajo de cada estudiante, que es un n�mero de cinco cifras (ejemplo: 45876).

2 Ordenar de manera ascendente los n�meros de legajo.

3 Luego, debe ingresar 5 apellidos de estudiantes que ingresan a la universidad.

4 Tambi�n debe ingresar la calificaci�n con la cual aprob� cada uno su examen de ingreso (de 6 a 10).

5 Determinar la nota m�xima y la nota m�nima.

6 En el algoritmo, se debe calcular el promedio de los ex�menes de los 5 estudiantes.

7 Mostrar en pantalla el apellido de cada estudiante, su n�mero de legajo, y su calificaci�n del examen de ingreso.

8 Mostrar tambi�n en pantalla la calificaci�n m�xima, la m�nima, y a qui�n pertenece cada una.

9 Mostrar en pantalla finalmente el promedio de los ex�menes.*/

package FigueredoCachi.src.evaluacion;

import java.util.Arrays;
import java.util.Scanner;

public class evaluacion {

	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);

		String apellidomin = "ejemplo";
		String apellidomax = "ejemplo";
		int notamin = 100;
		int notamax = -100;
		int promedio = 0;
		int[] nota = new int[5];
		int[] legajo = new int[5];
		String[] apellido = new String[5];
		/* 1 */
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese el legajo del estudiante: ");
			legajo[i] = entrada.nextInt();
		}
		/* 2 */
		Arrays.sort(legajo);

		System.out.println("Legajos ordenados de forma ascendente:\n");

		for (int i = 0; i < 5; i++) {
			System.out.println(legajo[i]);
		}

		/* 3 */
		for (int i = 0; i < 5; i++) {
			System.out.println("\nIngrese el apellido del legajo " + legajo[i] + ":");
			apellido[i] = entrada.next();
		}

		/* 4 */
		for (int i = 0; i < 5; i++) {
			System.out.println("\nIngresar la nota con la que aprobo " + apellido[i] + ":");
			nota[i] = entrada.nextInt();
		}
		/* 5 */
		for (int i = 0; i < 5; i++) {
			if (nota[i] > notamax) {
				notamax = nota[i];
				apellidomax = apellido[i];

			}
			if (nota[i] < notamin) {
				notamin = nota[i];
				apellidomin = apellido[i];
			}

		}

		/* 6 */
		for (int i = 0; i < 5; i++) {
			promedio = nota[i] + promedio;
		}

		promedio = promedio / 5;

		/* 7 */
		for (int i = 0; i < 5; i++) {
			System.out.println("\nApellido del estudiante: " + apellido[i] + ", numero de legajo: " + legajo[i] + ", calificacion: " + nota[i]);
		}

		/* 8 */
		System.out.println("\nLa nota maxima fue de un " + notamax + ", y es de: " + apellidomax);
		System.out.println("\nLa nota minima fue de un " + notamin + ", y es de: " + apellidomin);

		/* 9 */
		System.out.println("\nEl promedio de las notas fue de un " + promedio);

	}
}
