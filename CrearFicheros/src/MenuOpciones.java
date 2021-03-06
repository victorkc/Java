import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/* 1. Programa menu opciones:
 * 		1. Crear fichero.
 * 		2. Mostrar inf. fichero (Nombre, ruta absoluta, ruta relativa, longitud tama�o del archivo).
 * 		3. Mostrar longitud del fichero.
 * 		4. Comprobar si existe.
 * 		5. Borrar fichero.
 * 		6. Salir.
 * */

public class MenuOpciones {

	private static final String hola = null;

	static void crearFichero() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Di el nombre del archivo que quieres darle: ");
		String nombre = scan.nextLine();

		File fichero = new File(nombre);

		try {
			if (fichero.createNewFile() == true)
				System.out.println("El fichero se ha creado");
			else
				System.out.println("El fichero no se ha creado");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void mostrarInfFichero() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Di el nombre del archivo del que quieres saber la informaci�n: ");
		File fichero = new File(scan.nextLine());
		System.out.println(" Nombre: " + fichero.getName());
		System.out.println(" Ruta absoluta: " + fichero.getAbsolutePath());
		System.out.println(" Ruta relativa: " + fichero.getPath());
		System.out.println(" Longitud: " + fichero.length() + "\n");
	}

	static void mostrarLongFichero() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Di el nombre del archivo del que quieres saber la informaci�n: ");
		File fichero = new File(scan.nextLine());
		System.out.println("\n Longitud: " + fichero.length());
	}

	static void comprobarSiExiste() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Di el nombre del archivo que quieres saber si existe: ");
		File fichero = new File(scan.nextLine());
		if (fichero.exists())
			System.out.println("\n El fichero existe");
		else
			System.out.println("\n El fichero no existe");
	}

	static void borrarFichero() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Di el nombre del archivo que quieres borrar: ");
		File fichero = new File(scan.nextLine());
		fichero.delete();
	}
	
	static void arbolCarpetas() {
		Scanner scan = new Scanner(System.in);
		String cadena = scan.nextLine();
		File fichero = new File(cadena);
		fichero.mkdir();
		fichero = new File(cadena + "\\Proyecto");
		fichero.mkdir();
		fichero = new File(cadena + "\\Proyecto\\bin");
		fichero.mkdir();
		fichero = new File(cadena + "\\Proyecto\\src");
		fichero.mkdir();
		fichero = new File(cadena + "\\Proyecto\\doc");
		fichero.mkdir();
		fichero = new File(cadena + "\\Proyecto\\bin\\bytecode");
		fichero.mkdir();
		fichero = new File(cadena + "\\Proyecto\\bin\\objetos");
		fichero.mkdir();
		fichero = new File(cadena + "\\Proyecto\\src\\clase");
		fichero.mkdir();
		fichero = new File(cadena + "\\Proyecto\\doc\\html");
		fichero.mkdir();
		fichero = new File(cadena + "\\Proyecto\\doc\\pdf");
		fichero.mkdir();
	}
	
	static void arbolCarpetas2() {
		Scanner scan = new Scanner(System.in);
		String cadena = scan.nextLine();
		File fichero = new File(cadena);
		String cadenas[] = {"\\Proyecto\\bin"
				+ "\\Proyecto\\bin"
				+ "\\Proyecto\\src"
				+ "\\Proyecto\\doc"
				+ "\\Proyecto\\bin\\bytecode"
				+ "\\Proyecto\\bin\\objetos"
				+ "\\Proyecto\\src\\clase"
				+ "\\Proyecto\\doc\\html"
				+ "\\Proyecto\\doc\\pdf"};
		
		
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcion;
		do {
		System.out.println("Elige una opcion: \n"
				+ "1. Crear fichero.\n" 
				+ "2. Mostrar inf. fichero.\n"
				+ "3. Mostrar long fichero.\n"
				+ "4. Comprobar si existe.\n"
				+ "5. Borrar fichero.\n"
				+ "6. Crear carpetas hardcodeado\n"
				+ "7. Crear carpetas con m�todo\n"
				+ "9. Salir.\n"
				+ "Escriba su opcion: ");

		opcion = scan.nextInt();

			switch (opcion) {
			case 1:
				crearFichero();
				break;
			case 2:
				mostrarInfFichero();
				break;
			case 3:
				mostrarLongFichero();
				break;
			case 4:
				comprobarSiExiste();
				break;
			case 5:
				borrarFichero();
				break;
			case 6:
				arbolCarpetas();
				break;
			case 7:
				
				break;
				
			case 9:
				break;

			}
		} while (opcion != 6);
	}

}
