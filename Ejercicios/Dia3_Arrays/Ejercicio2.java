package Dia3_Arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Rellena un Array con números aleatorios entre 1 y 5. La dimensión del array es aleatoria entre 2 y 20 posiciones. Saca una tabla por pantalla que diga: 
			Tiene (las posiciones que sean) y su contenido es 
			EL 1 
			SALE X VECES 
			EL 2 
			SALE X VECES 
			EL 3 
			SALE X VECES 
			...RESTO NÚMEROS... 

			X es el número de veces que se repite ese número en el array. 
		*/
		
		Random random = new Random();
		int comparador = 0;
		int longitudArray = random.nextInt (20)+1;
		int[] vector = new int[longitudArray];
		int[] vector2 = new int[longitudArray];
		int[] vector3 = new int[longitudArray];
		int rangoMaxNumeros = 5;
		
		//vector es el vector aleatorio tanto en longitud como en cada posición
		for (int i = 0; i < vector.length; i++) {
			vector[i]=random.nextInt (rangoMaxNumeros)+1;
			
		}
		System.out.println("El array aleatorio es:");
		System.out.println(Arrays.toString(vector));
		
		//vector2 es el vector ordenado de menor a mayor
		for (int i = 0; i < vector.length; i++) {
			vector2[i]=vector[i];
		}
		Arrays.sort(vector2);
				
		//vector3 es el array rellenado con los números que aparecen en el array.	
		for (int i = 1; i < vector2.length; i++) {
			vector3[0]=vector2[0];
			if (vector2[i]!=vector2[i-1]) {
				vector3[i]=vector2[i];
			}
		}
		
		System.out.printf("El array tiene una longitud de %d números%n",longitudArray);
		//Este for anidado cuenta el número de veces que aparece el número 
		for (int i = 0; i < vector3.length; i++) {
			if (vector3[i]!=0) {
				for (int j = 0; j < vector2.length; j++) {
					if (vector3[i]==vector2[j]) {
						comparador = comparador + 1;
					}
					
				}
				System.out.printf("El número %d aparece un total de %d veces%n",vector3[i],comparador);
				comparador = 0;

			}
		}
	}

}
