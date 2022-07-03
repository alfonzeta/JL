package Dia2;

import java.util.Scanner;

public class ejercicio2parte2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Crea un contador de caracteres en una cadena.
		//Ej: “Hola mundo”  Buscamos la ‘o’  tiene 2 letras ‘o’

		//Además, cuentas los caracteres que se repiten en dos cadenas diferentes.
		//Ej: “Hola Mundo” y “Mola Mucho”  Tienen 6 caracteres en la misma posición (ojo con los espacios).

		String cadena1;
		String cadena2;
		String cadena1Igualada="";
		String cadena2Igualada="";
		char uno = ' ';
		int contador = 0;
		
		Scanner lectorScanner = new Scanner (System.in);
		System.out.println("Introduce la primera cadena a comparar:");
		cadena1=lectorScanner.nextLine();
		System.out.println("Introduce la segunda cadena a comparar:");
		cadena2=lectorScanner.nextLine();
		
		//Si cadena1 es más larga que cadena2 = exception in thread "main", por tanto, limito la cadena 2 al largo de la cadena 1.
		
		if (cadena1.length()>cadena2.length()) {
			cadena1Igualada=(cadena1.substring(0,cadena2.length()));
			cadena2Igualada=cadena2;
		} else if (cadena1.length()<cadena2.length()) {
			cadena2Igualada=(cadena2.substring(0,cadena1.length()));
			cadena1Igualada=cadena1;
		} else {
			cadena1Igualada=cadena1;
			cadena2Igualada=cadena2;
		}
		System.out.println(cadena1Igualada);
		System.out.println(cadena2Igualada);
		
		for (int i = 0; i < cadena1Igualada.length(); i++) {
			
			if (cadena1Igualada.charAt(i)==cadena2Igualada.charAt(i)&&cadena1Igualada.charAt(i)!=uno) {
				contador= contador +1;
				System.out.printf("La posición %d de cadena1 es '%c', la posición %d de cadena2 es '%c'. Ambas letras coinciden.%n",i,cadena1Igualada.charAt(i),i,cadena2Igualada.charAt(i));
			} else if (cadena1Igualada.charAt(i)==cadena2Igualada.charAt(i)&&cadena1Igualada.charAt(i)==uno) {
				System.out.printf("La posición %d de cadena1 es '%c', la posición %d de cadena2 es '%c'. Los espacios no cuentan, por tanto ambas letras no coinciden.%n",i,cadena1Igualada.charAt(i),i,cadena2Igualada.charAt(i));
			} else {
				System.out.printf("La posición %d de cadena1 es %c, la posición %d de cadena2 es '%c'. Ambas letras no coinciden.%n",i,cadena1Igualada.charAt(i),i,cadena2Igualada.charAt(i));
			}
			
			
		}
		System.out.printf("El número de letras que se repiten en la misma posición en ambas cadenas es %d.",contador);
	}

}
