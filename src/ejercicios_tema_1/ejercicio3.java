package ejercicios_tema_1;
import java.util.Scanner; 

/* El usuario debe ingresar un número y el programa debe indicar si es par o impar. */ 
/* INICIO
 * PEDIR NUMERO
 * LEER NUMERO
 * SI NUMERO % 2 = 0 ENTONCES
 * ESCRIBIR "El numero es par
 * Si no
 * ESCRIBIR "El numero es impar
 * FIN*/

public class ejercicioTres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Por favor ingrese un numero: ");
		
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.print("El numero es par");
		} else {
			System.out.print("El numero es impar");
		}		
		
		sc.close();
		
	}

}
