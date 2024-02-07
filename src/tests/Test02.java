package tests;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Generar Scanner para poder leer datos del usuario
		Persona[] personas = new Persona[50];
		int mayoresEdad = 0; // Variable que almacena las personas mayores de edad
		int mayoresEdadHombres = 0; // Variable que almacena los hombres mayores de edad
		int menoresEdad = 0; // Variable que almacena las personas menores de edad
		int menoresEdadMujeres = 0; // Variable que almacena las mujeres mayores de edad
		double porcentajeMayoresEdad = 0; // Variable que almacena el porcentaje de las personas mayores de edad
		double porcentajeMujeres = 0; // Variable que almacena el porcentaje de mujeres

		// Pedimos los datos para cada persona
		for (int i = 0; i < personas.length; i++) {
			System.out.println("\nDatos de una persona:");
			System.out.println("Edad:");
			int edad = sc.nextInt();
			sc.nextLine();
			System.out.println("Sexo M/F: ");
			char sexo = sc.nextLine().charAt(0);
			personas[i] = new Persona(edad, sexo);
		}

		// Analizamos los datos de cada persona
		for (Persona p : personas) {
			if (p.mayorEdad()) {
				mayoresEdad++;
				if (p.getSexo() == 'M')
					mayoresEdadHombres++;
			} else {
				menoresEdad++;
				if (p.getSexo() == 'F')
					menoresEdadMujeres++;
			}
		}

		// Calculamos los porcentajes del grupo
		porcentajeMayoresEdad = 100 * mayoresEdad / personas.length;
		porcentajeMujeres = 100 * totalMujeres(personas) / personas.length;

		// Imprimimos por pantalla los resultados
		System.out.println("Personas mayores de edad: " + mayoresEdad);
		System.out.println("Personas menores de edad: " + menoresEdad);
		System.out.println("Hombres mayores de edad: " + mayoresEdadHombres);
		System.out.println("Mujeres menores de edad: " + menoresEdadMujeres);
		System.out.println("Porcentaje mayores de edad: " + porcentajeMayoresEdad);
		System.out.println("Porcentaje mujeres: " + porcentajeMujeres);
	}

	/**
	* Funcion que calcula el total de mujeres en un array de personas
	* 
	* @param personas array del cual se va a calcular
	* @return total de mujeres en el array
	*/
	public static int totalMujeres(Persona[] personas) {
		int mujeres = 0;
		for (Persona p : personas) {
			if (p.getSexo() == 'F')
				mujeres++;
		}
		return mujeres;
	}
}