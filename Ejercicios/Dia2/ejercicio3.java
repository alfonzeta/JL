package Dia2;

import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Extrae nombre y apellidos. Por ejemplo “Carlos Rufiángel García” debe salir como: 
		Nombre: Carlos 
		Apellido 1: Rufiángel 
		Apellido 2: García 
		OJO  Contempla el caso de tener nombre compuesto, por ejemplo, Miguel Ángel, pero no el caso de tener apellidos compuestos. 
		*/
		
		String nombreyApellidos = "";
		int divisionNombreyApellidos;
		String nombre = "";
		String apellidos = "";
		
		Scanner lectorScanner = new Scanner (System.in);
		System.out.println("Introduce tu nombre:");
		nombreyApellidos = lectorScanner.nextLine();
		
		if (nombreyApellidos.indexOf(" ")>=0) {
			apellidos = nombreyApellidos.substring(nombreyApellidos.lastIndexOf(' ')+1,nombreyApellidos.length());
			nombreyApellidos = nombreyApellidos.substring(0,nombreyApellidos.lastIndexOf(' '));
			apellidos = nombreyApellidos.substring(nombreyApellidos.lastIndexOf(' ')+1,nombreyApellidos.length()) + " " + apellidos;
			nombre = nombreyApellidos.substring(0,nombreyApellidos.lastIndexOf(' '));
			//System.out.println(nombre);
			System.out.println(nombre);
			System.out.println(apellidos);
		}else {
			nombre = nombreyApellidos.substring(0,nombreyApellidos.length());
			System.out.println(nombre);
			}

		//System.out.println(nombreyApellidos.substring(0,));	}
	
		
				

	}
	

}
