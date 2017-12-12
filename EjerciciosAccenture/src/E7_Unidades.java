import java.util.Scanner;

public class E7_Unidades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduzca peso en Kg");
		double kg = scan.nextDouble();
		System.out.println(
				"A qué unidad quieres cambiar el peso? Opciones: Hg, Dg, g, dg, cg, mg. Elige escribiendo un número entre 1 y 6");
		short eleccion = scan.nextShort();

		switch (eleccion) {
		case 1:
			System.out.println("Cambio a Hectogramos: " + kg*10);
			break;
		case 2:
			System.out.println("Cambio a Decagramos: " + kg*100);
			break;
		case 3:
			System.out.println("Cambio a gramos: " + kg*1000);
			break;
		case 4:
			System.out.println("Cambio a decigramos: " + kg*10000);
			break;
		case 5:
			System.out.println("Cambio a centigramos: " + kg*100000);
			break;
		case 6:
			System.out.println("Cambio a miligramos: " + kg*1000000);
			break;

		default:
			break;
		}

	}

}
