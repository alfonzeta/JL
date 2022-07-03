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
		nombreyApellidos=lectorScanner.nextLine();
		divisionNombreyApellidos=nombreyApellidos.indexOf(" ");

		nombre = nombreyApellidos.substring(0,divisionNombreyApellidos);
		apellidos = nombreyApellidos.substring(divisionNombreyApellidos+1,nombreyApellidos.length());
		
		System.out.println(nombre);
		System.out.println(apellidos);
		//System.out.println(nombreyApellidos.substring(0,));
	}

}
