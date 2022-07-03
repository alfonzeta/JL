package Dia1;

import java.util.Scanner;

public class ejercicio4 {
	//Escribir un algoritmo que permita introducir números por teclado hasta que la suma de todos ellos sea mayor que 30
	//hay que tener en cuenta que el primer número introducido ya puede ser mayor de 30.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		int suma_numero;
		int acumulado;
		int presupuesto_inicial;
		int presupuesto_actualizado;
		
		acumulado=0;
		presupuesto_inicial=30;
		presupuesto_actualizado=30;
		Scanner lector = new Scanner(System.in);
		do {
			System.out.printf("Tienes %d €, ¿cuánto cuesta el artículo?%n",presupuesto_actualizado);
			numero=lector.nextInt();
			acumulado = acumulado + numero;
			presupuesto_actualizado = presupuesto_actualizado - numero;
			if (acumulado < 30) {
				
				System.out.printf("Hasta ahora te has gastado %d euros, todavía te quedan %d por gastar. ",acumulado,presupuesto_actualizado);
			} else {
				if (acumulado == 30) {
					System.out.println("Te has gastado todo tu dinero");
				} else {
					if (acumulado > 30) {
						System.out.printf("Si tienes %d euros de presupuesto, no puedes gastarte %d euros, te faltarían %d euros. ",presupuesto_inicial,acumulado,acumulado-presupuesto_inicial);
					}
				}
			}
		} while (acumulado<30);
		
	}

}
