package victor;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		boolean encontrado = false;
		
		int [] enteros = {4, 5, 7, 10, 14, 9, 17, 2, 1, 28};
		
		for(int i=0; i<enteros.length && encontrado == false; i++) {
			if(enteros[i] == 1){
				encontrado = true;
			System.out.println(encontrado);
			}
				
		}
		if(encontrado == false)
			System.out.println(" No se ha encontrado un 1");
		
	}

}
