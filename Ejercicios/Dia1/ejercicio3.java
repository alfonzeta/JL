package Dia1;

import java.util.Scanner;

public class ejercicio3 {
	//Solicita un día, un mes y un año de manera numérica. Muestra la fecha en modo texto:
	//Para día=1, mes=2 y año=2020 debe mostrar “hoy es 1 de febrero de 2020”


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		int month_int;
		String month_string;
		int year;
		month_string="";
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el día");
		day=lector.nextInt();
		System.out.println("Introduce el numero de mes");
		month_int=lector.nextInt();
		//lector.nextLine();
		
		switch (month_int) {
		case 1: {
			month_string="Enero";
			break;
		}
		case 2: {
			month_string="Febrero";
			break;
		}
		case 3: {
			month_string="Marzo";
			break;
		}
		case 4: {
			month_string="Abril";
			break;
		}
		case 5: {
			month_string="Mayo";
			break;
		}
		case 6: {
			month_string="Junio";
			break;
		}
		case 7: {
			month_string="Julio";
			break;
		}
		case 8: {
			month_string="Agosto";
			break;
		}
		case 9: {
			month_string="Septiembre";
			break;
		}
		case 10: {
			month_string="Octubre";
			break;
		}
		case 11: {
			month_string="Noviembre";
			break;
		}
		case 12: {
			month_string="Diciembre";
			break;
		}
			
		}
		System.out.println("Introduce el año");
		year=lector.nextInt();
		
		System.out.printf("Estamos a %d de %s de %d",day,month_string,year);
		}
	

	}


