package victor;

public class Ejercicio2 {
	
	public static void main (String [] args){
		int op1 = 6, op2 = 3;
		int opcion = 0;
		
		//Menú de opciones de calculadora.
		System.out.println("Elige opciones del 1 al 5: 1(sumar), 2(restar), 3(multiplicar), 4(dividir), 5(salir)");
		
		switch (opcion) {
		
		case 1: opcion = 1;
		System.out.println(op1+" + "+op2+" = "+(op1+op2));
		break;
		
		case 2: opcion = 2;
		System.out.println(op1+" - "+op2+" = "+(op1-op2));
		break;
		
		case 3: opcion = 3;
		System.out.println(op1+" * "+op2+" = "+(op1*op2));
		break;
		
		case 4: opcion = 4;
		System.out.println(op1+" / "+op2+" = "+(op1/op2));
		break;
		
		case 5: opcion = 5;
		return;
			
		}
		
		
	}

}
