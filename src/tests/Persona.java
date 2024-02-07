package tests;

public class Persona {
	private int edad;
	private char sexo;

	// Constructor de la clase
	public Persona(int edad, char sexo) {
		super();
		this.edad = edad;
		this.sexo = sexo;
	}

	/**
	* Funcion que comprueba si la persona es mayor de edad
	* 
	* @return true en caso de ser mayor a 18 años
	* @return false en caso de ser menor a 18 años
	*/
	public boolean mayorEdad() {
		if (edad >= 18)
			return true;
		else
			return false;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}