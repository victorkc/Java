import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

// Crear carpeta para guardar datos.
		File directorio = new File("CarpetaArchivos");
		File fichero = new File("DatosMaquina.txt");
		Scanner scan = new Scanner(System.in);
		File ficheroUsuario = new File(scan.nextLine());
		
		if(directorio.mkdir() == true)
			directorio.mkdir();
		else
			System.out.println("Ya está creada la carpeta automática");
// Crear archivos donde guardar los datos.
		try {
			
			if(fichero.createNewFile() == true)	// true si no existe.
				fichero.createNewFile();
			else
				System.out.println("El archivo automático ya está creado.");
			System.out.println("Escribe el nombre del archivo: ");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
