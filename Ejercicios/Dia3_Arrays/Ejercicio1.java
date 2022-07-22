package Dia3_Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media.
		
		int contador = 0;
		int[] vector = new int[100];
		
		for (int i = 0; i < vector.length; i++) {
			vector[i]=contador+1;
			contador = contador + 1;
			
		}
		System.out.println(Arrays.toString(vector));
	}

}
