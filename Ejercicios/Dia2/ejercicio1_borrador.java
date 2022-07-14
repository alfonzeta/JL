package Dia2;

import java.util.Scanner;

public class ejercicio1_borrador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		System.err.print(cadenaOculta);
		//cadenaOculta = cadenaUsuario.replace("h", "z");
		//System.err.println(cadenaOculta);
		
		
		
		System.out.printf("%nIntroduce una letra");
		letra = lectorScanner.next().charAt(0);
		System.out.println(letra);

			for (int i = 0; i < cadenaUsuario.length(); i++) {
				if (letra==cadenaUsuario.charAt(i)) {
					cadenaOculta = cadenaOculta.replace(cadenaOculta.charAt(i), letra);
				}
			}
		
			System.out.println(cadenaOculta);
		}


		
	}
