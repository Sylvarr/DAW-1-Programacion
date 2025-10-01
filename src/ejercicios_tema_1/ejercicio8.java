package ejercicios_tema_1;
import java.util.Scanner;

/* El usuario ingresa un número y el programa muestra su tabla de multiplicar del 1
al 10. */

/*INICIO
 * pedir numero
 * leer numero
 * para i desde 1 hasta 10
 * 	escribir numero "x" i = x*i 
 * FIN*/

public class ejercicioOcho {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor introduce un numero: ");
		int numero = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(numero + "*" + i + "=" + numero*i + " " );
		}
		
		sc.close();
	}
}
