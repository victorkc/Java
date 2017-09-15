package victor;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Decir si un número es primo o no.
		int num = 8;
		int contador = 0;
		
		if(num == 2 || num ==3)
			System.out.println("El número no es primo");

		else {
		
			for(int i=2; i<num && contador == 0; i++){
				
				if(num%i == 0){
					//System.out.println("El número no es primo.");
					contador++;
				}
				
				
			}
		}
		
		if(contador>0) {
			System.out.println("No es primo");
		}
		else {
			System.out.println("PRIMO");
		}
		

	}

}
