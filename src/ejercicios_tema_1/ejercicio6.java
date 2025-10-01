package ejercicios_tema_1;
import java.util.Scanner;

/*El usuario debe ingresar tres números y el programa debe determinar cuál es el mayor.*/

/*INICIO
 * pedir n1
 * leer n1
 * pedir n2
 * leer n2
 * pedir n3
 * leer n3
 * leer mayor = 0
 * SI n1 > n2 entonces
 * leer mayor = n1
 * SI NO 
 * leer mayor = n2
 * SI mayor < n3
 * escribir n3
 * SI NO
 * Escribir mayor*/

public class ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un primer numero: ");
		int numeroUno = sc.nextInt();
		System.out.print("Dime un segundo numero: ");
		int numeroDos = sc.nextInt();
		System.out.print("Dime un tercer numero: ");
		int numeroTres = sc.nextInt();
		
		int numeroMayor = 0;
		
		if (numeroUno > numeroDos) {
			numeroMayor = numeroUno; 
		} else {
			numeroMayor = numeroDos;
		}
		
		if (numeroMayor < numeroTres) {
			System.out.print("El numero mayor es: " + numeroTres);
		} else {
			System.out.print("El numero mayor es: " + numeroMayor);
		}
	
		sc.close();
	}

}
