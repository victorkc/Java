import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void menu(ArrayList<Persona> lista) {

		boolean salir = true;

		// MENU

		while (salir) {
			File archivo = new File("personas.txt");
			Scanner scan = new Scanner(System.in);
			int eleccion, elecPersona;
			System.out.println("Escribe una de las opciones:");
			System.out.println("1. Escribir fichero\n" + "2. Leer fichero\n" + "3. Escribir por pantalla\n"
					+ "4. Vaciar Estructura\n" + "5. Modificar persona\n" + "6. Borrar persona\n"
					+ "7. Añadir nueva persona\n" + "9. Salir\n");
			eleccion = Integer.parseInt(scan.nextLine());

			// FIN DEL MENU

			switch (eleccion) {
			case 1: // ESCRIBIR FICHERO
				System.out.println("Se ha guardado toda la estructura en un buffer.");
				FileWriter archivoEscritura;

				try {

					archivoEscritura = new FileWriter(archivo);
					BufferedWriter escribirBuffer = new BufferedWriter(archivoEscritura);

					for (int i = 0; i < lista.size(); i++)
						lista.get(i).escribirFichero(escribirBuffer);

					escribirBuffer.close();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 2: // LEER FICHERO

				lista.clear(); // Borra todo.
				String linea;

				try {
					FileReader archivoLectura = new FileReader(archivo);
					BufferedReader lecturaBuffer = new BufferedReader(archivoLectura);

					linea = lecturaBuffer.readLine();

					while (linea != null) {

						Persona p = new Persona();

						p.setNombre(linea);
						linea = lecturaBuffer.readLine();
						p.setApellido(linea);
						linea = lecturaBuffer.readLine();
						p.setEdad(Integer.parseInt(linea));

						lista.add(p);
						linea = lecturaBuffer.readLine();

					}
					lecturaBuffer.close();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;

			case 3: // ESCRIBIR PANTALLA
				for (int j = 0; j < lista.size(); j++)
					System.out.println("Nombre: " + lista.get(j).getNombre() + ", Apellido: "
							+ lista.get(j).getApellido() + ", Edad: " + lista.get(j).getEdad());
				System.out.println("\n");
				break;

			case 4: // VACIAR ESTRUCTURA
				lista.clear();
				System.out.println("La estructura está vacía\n");
				//for (int j = 0; j < lista.size(); j++)
					//lista.get(j).vaciarEstructura();
				break;

			case 5: // MODIFICAR PERSONA
				System.out.println("Elige la persona que quieres modificar: ");
				elecPersona = Integer.parseInt(scan.nextLine());
				System.out.println("Di el nombre: ");
				lista.get(elecPersona).setNombre(scan.nextLine());
				System.out.println("Di el apellido: ");
				lista.get(elecPersona).setApellido(scan.nextLine());
				System.out.println("Di la edad: ");

				lista.get(elecPersona).setEdad(Integer.parseInt(scan.nextLine()));
				break;
			case 6: // BORRAR PERSONA
				System.out.println("Elige la persona que quieres borrar: ");
				elecPersona = Integer.parseInt(scan.nextLine());
				lista.remove(elecPersona);
				//lista.clear(); // Borra todo.
				break;
			case 7: // AÑADIR PERSONA
				
				Persona p = new Persona();
				System.out.println("Di el nombre: ");
				p.setNombre(scan.nextLine());
				System.out.println("Di el apellido: ");
				p.setApellido(scan.nextLine());
				System.out.println("Di la edad: ");
				p.setEdad(Integer.parseInt(scan.nextLine()));
				
				lista.add(p);
				break;

			case 9: // SALIR
				salir = false;
				break;
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<Persona> lista = new ArrayList<Persona>();

		lista.add(new Persona("Víctor", "Kraski Cieslak", 23));
		lista.add(new Persona("Grabriel", "Arrollo", 21));
		lista.add(new Persona("Fernando", "Silva", 20));
		lista.add(new Persona("Alejandro", "Palechor", 20));
		lista.add(new Persona("Jose Luís", "Java", 36));

		/*
		 * Persona[] lista = new Persona[5]; lista[0] = new Persona("Ana","Ruiz",11);
		 * lista[1] = new Persona("Jose","Fernandez",22); lista[2] = new
		 * Persona("María Luisa","Romo",33); lista[3] = new
		 * Persona("Víctor","De la Torre",44); lista[4] = new
		 * Persona("Ana Laura","De Frutos",55);
		 */

		menu(lista);

	}

}
