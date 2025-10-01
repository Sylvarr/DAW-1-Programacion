package ejercicios_tema_1;
import java.util.Scanner; 

/*El usuario ingresa un número y el programa debe calcular su factorial (multiplicación
de todos los números enteros positivos hasta ese número).*/ 

/*INICIO 
 *PEDIR NUMERO 
 *LEER NUMERO
 *LEER FACTORIAL = 1
 *Para i desde 1 hasta NUMERO hacer
 *FACTORIAL = FACTORIAL * i
 *Fin Para
 *Escribir "El factorial de" + NUMERO + " es:" + FACTORIAL
 *FIN */

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor introduce un numero: ");
		int numero = sc.nextInt();
		int factorial = 1;
		
		for (int i = 1; i <= numero; i++) {
			factorial = factorial * i;
		}
		
		System.out.print("El factorial de " + numero + " es: " + factorial);
		
		sc.close();
	}

}
