import java.util.Scanner;

public class E13_PalabraInversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean fin = true;
		String word;

		Scanner scan = new Scanner(System.in);
		System.out.println("Program started.");
		System.out.println("To finish the program write \"fin\".");
		while (fin) {
			word = scan.nextLine();
			if (word.equals("fin")) {
				fin = false;
				System.out.println("The program has finished.");
			} else
				System.out.println(new StringBuilder(word).reverse().toString());

		}

	}

}
