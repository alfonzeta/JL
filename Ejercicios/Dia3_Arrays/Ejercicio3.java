package Dia3_Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crea un Array de 10 números, estos serán aleatorios y sin que sean seguidos.
		Muestra por pantalla:

			El número mayor es X
			El número menor es Y
		*/

		Random random = new Random();
		int longitudArray = 10;
		int numeroMayor = 0;
		int maximoNumeroArray = 30;
		int numeroMenor = maximoNumeroArray;
		int[] vector = new int[longitudArray];
		
		
		//Asigna un valor númerico del 0 al maximoNumeroArray aleatoriamente a todas las posiciones del array y pueden repetirse uno detrás de otro. 
		for (int i = 0; i < vector.length; i++) {
			vector[i]=random.nextInt(maximoNumeroArray);
		}
		
		//Si el valor de una posición es igual al valor de la posición anterior, lo sustituye por un valor númerico aleatorio del 0 al maximoNumeroArray hasta que sea distinto.
		for (int i = 1; i < vector.length; i++) {
			if (vector[i] == vector[i-1]) {
				do {
					vector[i] = random.nextInt(maximoNumeroArray);
				} while (vector[i] == vector[i-1]);
			}	
		}
		System.out.println(Arrays.toString(vector));
		
		//Halla el número más alto y el número más bajo
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] > numeroMayor) {
				numeroMayor = vector[i];	
			} 
			if (vector[i] < numeroMenor) {
				numeroMenor = vector[i];
			}
		}
		
		
		System.out.println(numeroMayor);
		System.out.println(numeroMenor);
	}
}
