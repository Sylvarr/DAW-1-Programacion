package ejercicios_tema_1;
import java.util.Scanner;

/*El usuario tiene un saldo inicial y puede realizar operaciones de depósito, retiro o
consulta de saldo.*/

/*INICIO
 * leer saldo = 1000
 * repetir
 *  escribir "Seleccione una opción.
 *  escribir "1. Consultar saldo.
 *  escribir "2. Depositar dinero.
 *  escribir "3. Retirar dinero.
 *  escribir "4. Salir.
 *  leer opcion
 *  Si opcion < 1 O opcion > 4 entonces
 *  escribe "Por favor ingrese una opción válida."
 *  SI opcion = 1 entonces
 *   escribir "Su saldo saldo es" + saldo
 *  Si no Si opcion = 2 entonces 
 *   escribir "Ingrese la cantidad que quiere depositar.
 *   leer deposito
 *   saldo = saldo + deposito
 *   escribir "Deposito realizado. Saldo actual: " + saldo
 *  Si no Si opcion = 3 entonces
 *   escribir "Ingrese la cantidad que quiere retirar: "
 *   leer retiro 
 *   Si retiro > saldo entonces
 *    escribir "Saldo insuficiente."
 *   Si no
 *    saldo = saldo - retiro
 *    escribir "Retiro realizado. Saldo actual: " + saldo
 *   finSi
 *  finSi
 *  hasta que opcion = 4
 *  Escribir "Gracias por usar el cajero automático.*/


public class ejercicioDiez {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int saldo = 1000;
		int opcion;

		do {
			System.out.println("Selecciona una opción: ");
			System.out.println("1. Consultar saldo ");
			System.out.println("2. Depositar dinero ");
			System.out.println("3. Retirar dinero ");
			System.out.println("4. Salir ");

			opcion = sc.nextInt();
			
			if (opcion < 1 || opcion > 4) {
				System.out.println("Por favor ingrese una opción válida.");
			} else if (opcion == 1) {
				System.out.println("Su saldo es: " + saldo + " euros.");
			} else if (opcion == 2) {
				System.out.println("Ingrese la cantidad que quiere depositar: ");
				int deposito = sc.nextInt();
				saldo = saldo + deposito;
				System.out.println("Deposito realizado. Su saldo es de: " + saldo + " euros.");
			} else if (opcion == 3) {
				System.out.println("Ingrese la cantidad que quiere retirar: ");
				int retiro = sc.nextInt();
				if (retiro > saldo) {
					System.out.println("Saldo insuficiente.");
				} else {
					saldo = saldo - retiro;
					System.out.println("Retiro realizado. Su saldo actual es de: " + saldo + " euros.");
				}
			}
		} while (opcion != 4);
		System.out.println("Gracias por usar el cajero automático.");
		sc.close();
	}

}
