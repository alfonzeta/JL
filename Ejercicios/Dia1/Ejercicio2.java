package Dia1;

import java.util.Scanner;

public class Ejercicio2 {
	//Hacer un algoritmo que lea el nombre, apellido y la nota de un alumno.
	//Se debe imprimir un mensaje del tipo: Pedro Pérez tiene un aprobado. 
	//Las notas posibles son: “suspenso”, “aprobado”, “notable” y “sobresaliente”. 
	//Los rangos de cada nota son libres.

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
		System.out.println("Escribe tu nota");
		nota=lector.nextInt();
		//Quise agrupar condiciones pero no supe hacer "case nota>0&&nota<5"
		switch (nota) {
		case 0:
			System.out.printf("El alumno %s %s, ha sacado un %d, por lo tanto, tiene un suspenso.",nombre,apellidos,nota);
			break;
		case 1:
			System.out.printf("El alumno %s %s, ha sacado un %d, por lo tanto, tiene un suspenso.",nombre,apellidos,nota);
			break;
		case 2:
			System.out.printf("El alumno %s %s, ha sacado un %d, por lo tanto, tiene un suspenso.",nombre,apellidos,nota);
			break;
		case 3:
			System.out.printf("El alumno %s %s, ha sacado un %d, por lo tanto, tiene un suspenso.",nombre,apellidos,nota);
			break;
		case 4:
			System.out.printf("El alumno %s %s, ha sacado un %d, por lo tanto, tiene un suspenso.",nombre,apellidos,nota);
			break;
		case 5:
			System.out.printf("El alumno %s %s, ha sacado un %d, por lo tanto, tiene un aprobado.",nombre,apellidos,nota);
			break;
		case 6:
			System.out.printf("El alumno %s %s, ha sacado un %d, por lo tanto, tiene un aprobado.",nombre,apellidos,nota);
			break;
		case 7:
			System.out.printf("El alumno %s %s, ha sacado un %d, por lo tanto, tiene un aprobado.",nombre,apellidos,nota);			
			break;
		case 8:
			System.out.printf("El alumno %s %s, ha sacado un %d, por lo tanto, tiene un notable.",nombre,apellidos,nota);
			break;
		case 9:
			System.out.printf("El alumno %s %s, ha sacado un %d, por lo tanto, tiene un notable.",nombre,apellidos,nota);
			break;
		case 10:
			System.out.printf("El alumno %s %s, ha sacado un %d, por lo tanto, tiene un sobresaliente.",nombre,apellidos,nota);
			break;
		}
	}

}
