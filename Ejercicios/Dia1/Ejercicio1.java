package Dia1;
import java.util.Scanner;

public class Ejercicio1 {
//Calcular el área de un triángulo en función de la base y la altura. 
//Los datos base y altura deben ser solicitados como entrada (variables).
//ÁREA = BASE * ALTURA / 2

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base_triangulo;
		int altura_triangulo;
		int area_triangulo;
		Scanner lector = new Scanner (System.in);
		System.out.println("Escribe la base del tríangulo");
		base_triangulo=lector.nextInt();
		System.out.println("Escribe la altura del tríangulo");
		altura_triangulo=lector.nextInt();
		area_triangulo = (base_triangulo*altura_triangulo)/2;
		/*En los apuntes pone que %d es decimal y %i es entero, al principio utilicé %i pero no funcionaba, acabé usando %d y sí.
		System.out.printf("Si la base es %i, y la altura es %i, el área del triángulo es %i.",base_triangulo,altura_triangulo,area_triangulo);
		*/
		System.out.printf("Si la base es %d, y la altura es %d, el área del triángulo es %d.",base_triangulo,altura_triangulo,area_triangulo);

		
	}

}
