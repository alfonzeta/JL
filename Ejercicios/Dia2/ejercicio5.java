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
		String cadenaOculta;
		int contador = 0;
		char letra = ' ';
		
		Scanner lectorScanner = new Scanner (System.in);
		System.out.println("Introduce una frase secreta:");
		cadenaUsuario=lectorScanner.nextLine();
		
		
		
		System.out.println("La frase secreta es:");
		cadenaOculta=cadenaUsuario;
		for (int i = 0; i < cadenaUsuario.length(); i++) {
			if (cadenaUsuario.charAt(i)==cadenaOculta.charAt(i)) {
				cadenaOculta.replace(cadenaOculta.charAt(i), '*');
			}
			
		}
		System.err.println(cadenaOculta);
		
		System.out.printf("%nIntroduce una letra");
		letra=lectorScanner.next().charAt(0);
				
		for (int i = 0; i < cadenaUsuario.length(); i++) {
			if (letra==cadenaUsuario.charAt(i)) {
				cadenaUsuario.replace(cadenaUsuario.charAt(i), letra);
				System.out.println(cadenaUsuario);
			}
			
		}
		
	}

}
