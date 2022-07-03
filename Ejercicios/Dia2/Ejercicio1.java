package Dia2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Haz un buscador sobre el texto relatoString.
			
		El programa debe dar como resultado:
				- La palabra ______ se ha encontrado X veces.		(Si existe)
				- No se ha encontrado esa palabra			(Si no existe)
		*/
		
		String relatoString = "Harry Potter es una serie de novelas fantásticas de serie de novelas";
				//+ " escrita por la autora británica J. K. Rowling, en la que se describen las aventuras del joven aprendiz de magia y hechicería Harry Potter y sus amigos Hermione Granger y Ron Weasley, durante los años que pasan en el Colegio Hogwarts de Magia y Hechicería. El argumento se centra en la lucha entre Harry Potter y el malvado mago lord Voldemort, quien asesinó a los padres de Harry en su afán de conquistar el mundo mágico.";
		String palabraBuscadaString;
		String charPasaString;
		String iPasaString;
		int contador = 0;

	
		
		System.out.println("Introduce la palabra que quieres buscar, si deseas salir, escribe salir.");
		Scanner lectorScanner = new Scanner(System.in);
		palabraBuscadaString = lectorScanner.nextLine();

		
		System.out.println(relatoString.indexOf(palabraBuscadaString));
		System.out.println(relatoString.charAt(relatoString.indexOf(palabraBuscadaString)));
		System.out.println(relatoString.charAt(20));
		System.out.println(relatoString.charAt(21));
		System.out.println(relatoString.charAt(relatoString.indexOf(palabraBuscadaString)));
		
		
		while (!palabraBuscadaString.equals("salir")) {
			//En apuntes el salto de linea lo anoté como %n, me ha funcionado como \n			
			if (relatoString.indexOf(palabraBuscadaString) >= 0){
				
				System.out.printf("El texto contiene la palabra buscada '%s'\n",palabraBuscadaString);
				//System.out.println(relatoString.charAt(relatoString.indexOf(palabraBuscadaString)));
				//charPasaString = String.valueOf(relatoString.charAt(relatoString.indexOf(palabraBuscadaString)));
				//System.out.println(charPasaString);
				
				for (int i = 0; i < relatoString.length(); i++) {
					System.out.println(palabraBuscadaString.charAt(i));
					iPasaString= String.valueOf(relatoString.charAt(i));
					charPasaString=String.valueOf(palabraBuscadaString.charAt(i));
					if (iPasaString.equals(charPasaString)) {
						System.out.println(iPasaString);
					}
					//System.out.println(relatoString.substring(i));
				
				}

				
				
			}
			
			
			
			else if (relatoString.indexOf(palabraBuscadaString) < 0) {
				System.out.printf("El texto no contiene la palabra buscada '%s'\n",palabraBuscadaString);
			}
			
			
			System.out.println("Introduce la palabra que quieres buscar, si deseas salir, escribe salir.");
			palabraBuscadaString = lectorScanner.nextLine();

		}
		
		
		
		System.out.println("Has salido del buscador");
	}

}

