import java.util.Random;

public class GenPassCondiciones {

	public static void crearPassw() {
		int MAX = 16;
		String letras = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
		String mayus = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String numeros = "1234567890";
		String passw = "";
		boolean hayNum = false;
		int num;
		Random random = new Random();
		for (int j = 1; j < 21; j++) {
			passw = j + "º Contraseña generada: ";
			num = random.nextInt(26);
			passw += mayus.charAt(num);
			
			for (int i = 0; i < MAX-1; i++) {
				num = random.nextInt(61);
				passw += letras.charAt(num);
				if(i==3 && hayNum==false){
					num = random.nextInt(9);
					passw += numeros.charAt(num);
					i++;
				}
				if(num>50)
					hayNum = true;					
			}			
			System.out.println(passw);
			passw = "";
			hayNum = false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Se van a crear 20 contraseñas con la primera letra mayúscula y mínimo 1 número:\n");
		crearPassw();
	}

}
