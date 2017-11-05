import java.io.File;
import java.util.Scanner;

/* Programas a crear:
 * 1. Crear fichero con el nombre que se le indique.
 * 2. Crear carpeta con el nombre que se le indique. 
 * 3. Programa menu opciones:
 * 		1. Crear fichero.
 * 		2. Mostrar inf. fichero (Nombre, ruta absoluta, ruta relativa, longitud tamaño del archivo).
 * 		3. Mostrar longitud del fichero.
 * 		4. Comprobar si existe.
 * 		5. Borrar fichero.
 * 		6. Salir.
 * */
public class CrearCarpetas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nombre = scan.nextLine();
		
		File fichero = new File(nombre);
		
			if(fichero.mkdir() == true)
				System.out.println("El fichero se ha creado");
			else
				System.out.println("El fichero no se ha creado");
		

	}

}
