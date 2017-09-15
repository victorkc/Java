package victor;

public class Ejercicio4 {

	public static void main(String[] args) {
		int contador = 0;
		int [] enteros = {4, 5, 7, 10, 14, 9, 17, 2, 1, 28};
		
		for(int i=0; i<enteros.length; i++) {
			if(enteros[i]%2 == 0)
				contador++;
		}
		System.out.println(contador);
	}

}
