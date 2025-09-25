package ejercicios_tema_1;
import java.util.Scanner; 

/* El usuario debe ingresar dos números y el programa debe sumarlos y mostrar el
resultado. */

/* INICIO
 * PEDIR NUMERO 1
 * LEER NUMERO 1
 * PEDIR NUMERO 2
 * LEER NUMERO 2
 * RESULTADO = NUMERO 1 + NUMERO 2
 * ESCRIBIR RESULTADO */ 
 

public class ejercicioDos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor ingrese el primero numero: ");
		
		int numero1 = sc.nextInt();
		
		
		System.out.print("Por favor ingrese el segundo numero: ");
		
		int numero2 = sc.nextInt();
		
		
		int resultado = numero1 + numero2 ;
		
		System.out.print(resultado);
		
		sc.close();

	}

}
