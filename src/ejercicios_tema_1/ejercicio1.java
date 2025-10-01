package ejercicios_tema_1;
import java.util.Scanner; 

/* Se necesita un programa que pida el nombre del usuario y luego lo salude con un
mensaje personalizado. */

/* INICIO 
 * PEDIR NOMBRE
 * LEER NOMBRE
 * ESCRIBIR "Hola," + NOMBRE "."
 * FIN */ 


public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, ingrese su numbre: ");
		
		String nombre = sc.nextLine();
		
		System.out.print("Hola " + nombre + ", bienvenido!");
		
		sc.close();
		

	}

}
