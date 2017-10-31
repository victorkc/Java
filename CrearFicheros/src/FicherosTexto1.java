import java.io.*;

public class FicherosTexto1 {
	
	public static void escribirFichero(String[] lista)
	{
		try 
		{
			// 1. Crear fichero
			File fichero = new File("FicheroNombres.txt");
			FileWriter ficheroEscritura = new FileWriter(fichero);
			
			// 2. Escribir nombres
			for(int i=0;i<lista.length;i++)
			{
				ficheroEscritura.write(lista[i] + "#");
			}

			// 3. Cerrar fichero.
			ficheroEscritura.close();
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void leerFichero(String[] lista)
	{
		try 
		{
			// 1. Crear fichero
			File fichero = new File("FicheroNombres.txt");
			FileReader ficheroLectura = new FileReader(fichero);
			String cadenaFichero = "";
						
			// 2. Leer nombres
			char[] nombre = new char[8];
			int res;
			
			res = ficheroLectura.read(nombre);
			while (res != -1)
			{
				// Tratar la cadena

				cadenaFichero += String.valueOf(nombre); // Rellena el array de char con los 5 primeros caracteres que encuentra.
				res = ficheroLectura.read(nombre);
				for(int i=0; i<res; i++)
					;
					
					
					/*if(nombre[j] == '#')
					{
						for(int x=j; x<res; x++)
							nombre[x] = ' ';
							lista[i] = String.valueOf(nombre); // Rellena el array de char con los 5 primeros caracteres que encuentra.
						i++;
					}*/
				
				//res = ficheroLectura.read(nombre); // Dice los valores que se encuentra en el fichero que lee hasta que recibe un -1 para salir.
				//res = ficheroLectura.read(nombre);
							//System.out.println("entra2");
						//System.out.println("entra");
					//System.out.println(nombre[j]); // Comprueba que las letras entran en el array de char.
				
			}
			// 3. Cerrar fichero.
			ficheroLectura.close();
			
		
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	public static void imprimirTabla(String[] lista)
	{
		System.out.println("Contenido de la tabla:");
		for(int i=0;i<lista.length;i++)
		{
			System.out.println("Posición " + i + " : " + lista[i]); 
		}
	}	
	
	public static void inicializarTabla(String[] lista)
	{
		for(int i=0;i<lista.length;i++)
		{
			lista[i]="";
		}
	}
	
	public static void main(String[] args)
	{
		String[] lista = {"Pepe", "Ana", "Juan" };
		
		escribirFichero(lista);
		inicializarTabla(lista);
		leerFichero(lista);
		imprimirTabla(lista);
		
		
		
		
	}

}