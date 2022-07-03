package Dia1;

import java.util.Scanner;

public class Ejercicio2_con_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		String apellidos;
		int nota;
		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe tu nombre");
		nombre=lector.nextLine();
		System.out.println("Escribe tus apellidos");
		apellidos=lector.nextLine();
		
		do {
			System.out.println("Escribe tu nota");
			nota=lector.nextInt();
			if (nota<0 || nota>10) {
				System.out.println("Introduce una nota del 1 al 10");
			}
		} while (nota<0 || nota > 10);
		
		if (nota >= 0 && nota < 5) {
			System.out.printf("El alumno %s %s, ha sacado un %d, por lo tanto, tiene un suspenso.",nombre,apellidos,nota);
		} else {
			if (nota >= 5 && nota <= 7 ) {
				System.out.printf("El alumno %s %s, ha sacado un %d, por lo tanto, tiene un aprobado.",nombre,apellidos,nota);
			} else {
				if (nota == 8 || nota ==9) {
					System.out.printf("El alumno %s %s, ha sacado un %d, por lo tanto, tiene un notable.",nombre,apellidos,nota);
				} else {
					System.out.printf("El alumno %s %s, ha sacado un %d, por lo tanto, tiene un sobresaliente.",nombre,apellidos,nota);
				}
			}

		}
	}

}
