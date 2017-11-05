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
			// 1. Crear variable fichero que apunte al txt
			File fichero = new File("FicheroNombres.txt");
			FileReader ficheroLectura = new FileReader(fichero); // Fichero que va a leer el txt
			String cadenaFichero = ""; 
			int n=0;
						
			// 2. Leer nombres
			char[] nombre = new char[8];
			int res;
			
			res = ficheroLectura.read(nombre); /* Ocurren dos cosas, res recibe numeros, si es -1, signidica que es final de fichero
			 									  y fichero lectura lee hasta 8 caracteres del fichero porque es el límite dado en nombre
			 									  y lo mete dentro de nombre.*/
			//System.out.println(nombre); //imprime 8 caracteres.
			//System.out.println("res: "+ res);
			while (res != -1) // -1 es el final del txt
			{
				// Tratar la cadena

				//cadenaFichero += String.valueOf(nombre); // Rellena el array de char con los "nombre" primeros caracteres que encuentra.
				//res = ficheroLectura.read(nombre); //aquí vuelve a hacer otra lectura, se come la anterior
				//System.out.println("res: "+ res);
				
				for(int i=0; i<res; i++)
				{
					if(nombre[i] == '#')
					{
						//i++;
						n++;
						cadenaFichero = "";
					}
					else
					{
						cadenaFichero += nombre[i];
						lista[n] = cadenaFichero;
					}
				}
				
				res = ficheroLectura.read(nombre);
				//System.out.println("valor de res: " + res + " y valor de cadenaFichero: " + cadenaFichero);
					
					
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
	
	public static void vaciarTabla(String[] lista)
	{
		for(int i=0;i<lista.length;i++)
		{
			lista[i]="";
		}
	}
	
	public static void main(String[] args)
	{
		String[] lista = {"Pepe", "Ana", "Juan", "Víctor", "Lidia", "Lola de las fuentes", "Ángel de la torre"};
		
		escribirFichero(lista);
		vaciarTabla(lista);
		leerFichero(lista);
		imprimirTabla(lista);
		
	}

}