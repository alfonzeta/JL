package Dia2;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Extrae día, mes y año de una fecha. La fecha puede tener cualquiera de estas combinaciones: 
		01/01/2020 
		1/01/20 
		1/1/2020 
		01/1/2020 
		1/1/20 
		EJ: String fecha = “01/02/2020”;
		El día es 01
		El mes es 02
		El año es 2020
		*/

		
		String fecha;
		String day;
		String month;
		String year;
		int posicionSeparadorDia;
		int posicionSeparadorMes;
		
		
		Scanner lectorScanner = new Scanner (System.in);
		System.out.println("Introduce una fecha:");
		fecha=lectorScanner.nextLine();
		
		posicionSeparadorDia=fecha.indexOf("/");
		//System.out.println(posicionSeparadorDia);
		posicionSeparadorMes=fecha.indexOf("/",posicionSeparadorDia+1);
		//System.out.println(posicionSeparadorMes);
		
		day=fecha.substring(0,posicionSeparadorDia);
		month=fecha.substring(posicionSeparadorDia+1,posicionSeparadorMes);
		year=fecha.substring(posicionSeparadorMes+1);
		
		
		
		System.out.printf("El día es %s, el mes es %s, el año es %s",day,month,year);
		
		
	}

}
