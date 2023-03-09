package tests;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		int numero; // Variable que almacena el numero a tratar
		Scanner sc = new Scanner(System.in); // Generar Scanner para poder leer datos del usuario

		// Pedimos un numero al usuario para almacenarlo
		System.out.println("Introduce un numero:");
		numero = Math.abs(sc.nextInt());

		// En caso de ser par
		if (numero % 2 == 0) {
			System.out.println("\nEl numero es par:");
			printNumbers(numero);
		}
		// En caso de ser impar
		else {
			System.out.println("\nEl numero es impar:");
			printNumbers(numero);
		}
	}

	/**
	* Funcion que imprime por pantalla desde un numero hasta cero restando de 2 en 2
	* 
	* @param numero numero desde el que se comienza
	*/
	public static void printNumbers(int numero) {
		for (int i = numero; i >= 0; i -= 2)
			System.out.println(i);
	}
}