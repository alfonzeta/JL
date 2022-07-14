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
		String relatoString2 = relatoString;
		int contador = 0;
	
		
		System.out.println("Introduce la palabra que quieres buscar, si deseas salir, escribe salir.");
		Scanner lectorScanner = new Scanner(System.in);
		palabraBuscadaString = lectorScanner.nextLine();

			
		while (!palabraBuscadaString.equals("salir")) {
			//En apuntes el salto de linea lo anoté como %n, me ha funcionado como \n
			contador = 0;
			relatoString2=relatoString;
			
			if (relatoString2.indexOf(palabraBuscadaString) >= 0){
				
				for (int i = 0; i < relatoString2.length(); i++) {

				
					if (relatoString2.indexOf(palabraBuscadaString,i)>= 0) {
						contador = contador + 1;
						relatoString2=relatoString2.substring(relatoString2.indexOf(palabraBuscadaString)+1);
						
					}
				
				}
				
				//		posicionSeparadorMes=fecha.indexOf("/",posicionSeparadorDia+1);
				System.out.printf("El texto contiene la palabra buscada '%s', un total de %d veces\n",palabraBuscadaString,contador);
				
				
			} else if (relatoString.indexOf(palabraBuscadaString) < 0) {
				System.out.printf("El texto no contiene la palabra buscada '%s'\n",palabraBuscadaString);
			}
			
			
			System.out.println("Introduce la palabra que quieres buscar, si deseas salir, escribe salir.");
			palabraBuscadaString = lectorScanner.nextLine();

		}
		
		
		
		System.out.println("Has salido del buscador");
	}

}

