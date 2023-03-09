package tests;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Generar Scanner para poder leer datos del usuario
		int horas; // Variable que almacena las horas trabajadas
		double tarifa; // Variable que almacena la tarifa de cada hora
		double sueldo; // Variable que almacena el sueldo total

		// Pedimos los datos al usuario
		System.out.println("Horas trabajadas:");
		horas = sc.nextInt();
		System.out.println("Tarifa por hora:");
		tarifa = sc.nextDouble();

		// Calculamos el usuario teniendo en cuenta si ha realizado horas extras
		if (horas <= 40) {
			sueldo = horas * tarifa;
		} else {
			int horasBase = 40;
			int horasExtra = horas - 40;
			sueldo = horasBase * tarifa + horasExtra * (1.5 * tarifa);
		}

		System.out.println("Sueldo total: " + sueldo + "€");
	}
}