package ejercicios_tema_1;
import java.util.Scanner;

/*El usuario debe ingresar un número y el programa debe indicar si es positivo,
negativo o cero.*/

/* INICIO
 * pedir n
 * leer n
 * SI n = 0 entonces
 * escribir "n es cero"
 * SI NO SI n < 0
 * escribir "n es negativo"
 * SI NO
 * escribir "n es positivo"
 * FIN*/

public class ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor introduce un numero: ");
		int numero = sc.nextInt();
		
		if (numero == 0) {
			System.out.print("El numero es cero.");
		} else if (numero < 0){
			System.out.print("El numero es negativo.");
		} else {
			System.out.print("El numero es positivo");
		}
		
		sc.close();
	}

}
