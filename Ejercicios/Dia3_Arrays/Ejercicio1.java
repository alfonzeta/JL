package Dia3_Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media.
		
		int[] vector = new int[3];
		int suma = 0;
		int media = 0;
		
		for (int i = 0; i < vector.length; i++) {
			vector[i]=i+1;
			suma += vector[i];
			
		}
		System.out.println(Arrays.toString(vector));
		System.out.println("Suma: " + suma);
		
		media = suma/vector.length;
		System.out.println("Media: " + media);
		
	}

}
