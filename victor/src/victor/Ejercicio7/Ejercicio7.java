package victor.Ejercicio7;

public class Ejercicio7 {

	public static void main(String[] args) {

		Profesor p1 = new Profesor("02709129M", "Xavier", "Ruedas", 4765.65, 1, true);
		Administracion a1 = new Administracion("02789546J", "Lola", "Torres", 654.23, 'M', 6);
		Directivo d1 = new Directivo("06458965K", "Aleija", "Juarga", 849.29, true, "Tarde");
		
		System.out.println(p1.toString());
		System.out.println(a1.toString());
		System.out.println(d1.toString());
		
		System.out.println("\nEl apellido del directivo es: "+d1.getDni().toString());
		

	}

}
