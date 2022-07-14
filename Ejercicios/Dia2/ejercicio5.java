package Dia2;

import java.util.Iterator;
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pregunta al usuario por una cadena secreta. Por ejemplo “Hola Mundo”. 
		//El usuario irá diciendo letras hasta que complete la palabra. 
		//Por ejemplo, pedirá la “o” y saldrá “*O** ****O”

		String cadenaUsuario;
		String cadenaOculta = "";
		String cadenaResultado= "";
		int contador = 0;
		int contadorCadenaLength = 0;
		char letra = ' ';
		
		Scanner lectorScanner = new Scanner (System.in);
		System.out.println("Introduce una frase secreta:");
		cadenaUsuario=lectorScanner.nextLine();


		for (int i = 0; i < cadenaUsuario.length(); i++) {
			if (cadenaUsuario.charAt(i)==' ') {
				cadenaOculta += ' ';
			}else {
					cadenaOculta += '*';
				}
				
		}
		System.out.print("La frase secreta es: ");

		System.err.println(cadenaOculta);
		
		cadenaResultado = cadenaOculta.substring(0,1)+"a"+cadenaOculta.substring(2,cadenaOculta.length());
		System.err.print(cadenaResultado);
		//cadenaOculta = cadenaUsuario.replace("h", "z");
		//System.err.println(cadenaOculta);
		
		//SUBSTRINGS
		//tolowercase
		//touppercase
		


		do {
			System.out.printf("%nIntroduce una letra");
			letra=lectorScanner.next().charAt(0);
			
			for (int i = 0; i < cadenaUsuario.length(); i++) {
				if (letra==cadenaUsuario.charAt(i)) {
					cadenaResultado = cadenaOculta.substring(0,cadenaUsuario.indexOf(letra))+letra+cadenaOculta.substring(cadenaUsuario.indexOf(letra)+1,cadenaOculta.length());
				}
			}
			System.out.println(cadenaResultado);
		} while (cadenaResultado!=cadenaUsuario);
		
		

		}


		
	}


