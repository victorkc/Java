import java.util.Random;

public class GeneradorPassw {

	public static void crearPassw() {
		int MAX = 16;
		String letras = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
		String passw = "";
		int num;
		Random random = new Random();
		for (int j = 1; j < 11; j++) {
			passw = j + "º Contraseña generada: ";
			for (int i = 0; i < MAX; i++) {
				num = random.nextInt(61);
				passw += letras.charAt(num);
			}
			System.out.println(passw);
			passw = "";
		}
	}

	public static void main(String[] args) {
		System.out.println("Se van a crear 10 contraseñas:\n");
		crearPassw();
	}

}
