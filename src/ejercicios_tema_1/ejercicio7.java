package ejercicios_tema_1;
import java.util.Scanner;

/* El usuario ingresa la cantidad de números que se quieren promediar y luego
introduce cada uno. El programa debe calcular y mostrar el promedio. 
Me siento incomodo que no haya una restriccion, por lo que pondre que solo se pueden 
meter hasta cinco numeros*/

/* INICIO
 * pedir numeroVeces
 * leer total
 * 
 * HACER 
 * 	escribir "Por favor introduce un numero entre 1 y 5"
 * 	leer numeroVeces
 * 	SI numeroVeces <=0 O numeroVeces > 5 
 * 	 escribir "Entrada invalida. Intentalo de nuevo."
 * 	FIN SI
 * MIENTRAS (numeroVeces <=0 O numeroVeces > 5)
 * 
 * PARA i desde 1 hasta numeroVeces
 * 	escribir "Por favor introduce el numero " + i + ":"
 * 	leer numero
 *  total = total + numero
 * FIN PARA
 *  escribir "El promedio es: " + (total / numeroVeces)
 * FIN */

/* Problemas principales: 
 * 1. Necesitamos que la accion de pedir el numero se rapita automaticamente 
 * si introducimos un numero fuera del rango. Para ello usamos el do-while que engloba
 * el hecho de pedir un numero hasta que se cumpla la condicion que pedimos
 * 
 * 2. Ya que trabajamos solo con int (numero enteros), va a ver perdida de informacion
 * cuando el resultado sea un float (tenga decimales) */

public class ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeroVeces;
		int total = 0;

		do {
			System.out.print("Por favor introduce un numero entre 1 y 5");
			numeroVeces = sc.nextInt();

			if (numeroVeces <= 0 || numeroVeces > 5) {
				System.out.print("Entrada invalida. Intentalo de nuevo.");
			}

		} while (numeroVeces <= 0 || numeroVeces > 5);

		
		for (int i = 1; i <= numeroVeces; i++) {
			System.out.print("Por favor introduce numero " + i + ":");
			total = total + sc.nextInt();
		}
		
		System.out.print("El promedio es: " + total/numeroVeces);
		sc.close();
	}
}
