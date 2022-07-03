package Dia1;

import java.awt.font.LineBreakMeasurer;
import java.util.Iterator;
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase;
		//String frase_conmutada;
		//int numero_de_caracteres;
		//frase_conmutada="";
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce una frase");
		frase=lector.nextLine();
		//frase_conmutada=frase;
		//numero_de_caracteres=frase.length();
		System.out.println("La frase que has introducido es:");
		System.out.println(frase);
		System.out.printf("La frase tiene en total %d caracteres",frase.length());
		System.out.println("");
		//System.out.println(frase.charAt(0));
		//System.out.println(frase.charAt(frase.length()-1));
		System.out.println("La frase, al revés quedaría así:");
		for (int i = 0; i < frase.length(); i++) {
			System.out.println(frase.charAt(frase.length()-(i+1)));
		}
			//frase_conmutada.charAt(frase_conmutada.length())=i;
			
		}
		
	}
			
			
		
	

