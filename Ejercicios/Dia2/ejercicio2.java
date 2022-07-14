package Dia2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crea un contador de caracteres en una cadena.
		//Ej: “Hola mundo”  Buscamos la ‘o’  tiene 2 letras ‘o’

		//Además, cuentas los caracteres que se repiten en dos cadenas diferentes.
		//Ej: “Hola Mundo” y “Mola Mucho”  Tienen 6 caracteres en la misma posición (ojo con los espacios).


		String relatoString = "Hola me llamo Alfonso y soy el peor programador del mundo, saludos";
		Character letraBuscadaString;
		int contador = 0;
		int salidaBuscador = 0;
		
		System.out.println("Introduce la letra que quieres buscar, si deseas salir, escribe el caracter 'ç'.");
		Scanner lectorScanner = new Scanner(System.in);
		letraBuscadaString = lectorScanner.next().charAt(0);
		
		while (!letraBuscadaString.equals('ç')) {
			//En apuntes el salto de linea lo anoté como %n, me ha funcionado como \n			
			if (relatoString.indexOf(letraBuscadaString) >= 0){
				
				for (int i = 0; i < relatoString.length(); i++) {
					if (relatoString.charAt(i)==letraBuscadaString) {
						contador=contador+1;
				}
				
				}
				System.out.printf("El texto contiene la letra buscada '%s', un total de %d veces\n",letraBuscadaString, contador);
				contador = 0;
			}
			else if (relatoString.indexOf(letraBuscadaString) < 0) {
				System.out.printf("El texto no contiene la letra buscada '%s'\n",letraBuscadaString);
				contador = 0;
			}
			
			
			System.out.println("Introduce la letra que quieres buscar, si deseas salir, escribe el caracter 'ç'.");
			letraBuscadaString = lectorScanner.next().charAt(0);

		}
		
		
		
		System.out.println("Has salido del buscador");
	}

}
