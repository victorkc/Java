import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Persona {
	private String nombre, apellido;
	private int edad;

	public Persona(String n, String ap, int e) {
		nombre = n;
		apellido = ap;
		edad = e;
	}
	
	public Persona() {}

	public void arrayPersonas() 
	{
		
	}


	public void escribirFichero(BufferedWriter escribirBuffer) {

		try {

			escribirBuffer.write(getNombre());
			escribirBuffer.newLine();
			escribirBuffer.write(getApellido());
			escribirBuffer.newLine();
			escribirBuffer.write(String.valueOf(getEdad()));
			escribirBuffer.newLine();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getNombre() {return nombre;}
	public String getApellido() {return apellido;}
	public int getEdad() {return edad;}
	public void setNombre(String n) {nombre = n;}
	public void setApellido(String n) {apellido = n;}
	public void setEdad(int n) {edad = n;}

	public void vaciarEstructura() {
		nombre = "";
		apellido = "";
		edad = 0;
	}

}
