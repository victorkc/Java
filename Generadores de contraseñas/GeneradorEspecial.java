
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.Scanner;

public class Generador {

	public static void crearPassw() {
		PrintWriter writer;
		try {
			writer = new PrintWriter("Codigos.txt", "UTF-8");

			int MAX = 8;
			String letras = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
			String passw = "";
			int num;
			Random random = new Random();
			for (int j = 0; j < 100; j++) {
				// passw = j + "º Contraseña generada: ";
				for (int i = 0; i < MAX; i++) {
					num = random.nextInt(61);
					passw += letras.charAt(num);
				}
				System.out.println(passw);
				writer.println(passw);
				passw = "";
			}
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("Se van a crear 10 contraseñas:\n");
		crearPassw();
	}

}
