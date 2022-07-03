package Dia2;

import java.util.Scanner;

public class ejercicio1_borrador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1;
		String cadena2;
		String cadena1LargodeCadena2;
		
		Scanner lectorScanner = new Scanner (System.in);
		System.out.println("Introduce la primera cadena a comparar:");
		cadena1=lectorScanner.nextLine();
		System.out.println("Introduce la segunda cadena a comparar:");
		cadena2=lectorScanner.nextLine();
		
		//Si cadena1 es más larga que cadena2 = exception in thread "main", por tanto, limito la cadena 2 al largo de la cadena 1.
		
		cadena1LargodeCadena2=(cadena1.substring(0,cadena2.length()));
		System.out.println(cadena1LargodeCadena2);
		
		//cadena1LargodeCadena2=(cadena2.substring(0,cadena1.length()));
		//System.out.println(cadena1LargodeCadena2);
		// TODO Auto-generated method stub
	}
}

