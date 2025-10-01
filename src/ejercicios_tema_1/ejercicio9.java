package ejercicios_tema_1;
import java.util.Scanner;

/*El usuario ingresa una lista de n números y el programa cuenta cuántos son pares.*/

/*INICIO
 * pedir numeroVeces
 * leer numeroVeces
 * leer pares
 * para i desde 1 hasta numeroVeces hacer
 *  pedir numero
 *  leer numero
 *  Si numero % 2 = 0 entonces
 * 	 pares += 1 
 * fin para
 * escribir pares
 * FIN */

public class ejercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor introduce la cantidad de numeros que quieres contar: ");
		int numeroVeces = sc.nextInt();
		int pares = 0;

		for (int i = 1; i <= numeroVeces; i++) {
			System.out.print("Por favor, introduce tu " + i + "º numero: ");
			int numero = sc.nextInt();

			if (numero % 2 == 0) {
				pares += 1;
			}
		}
		
		if (pares < 2) {
			System.out.print("Tu grupo de numeros contiene " + pares + " par.");
		} else {
			System.out.print("Tu grupo de numeros contiene " + pares + " pares.");
		}
		
		sc.close();
		
	}

}
