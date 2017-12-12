
public class E15_PiramideNumerica {

	public static void main(String[] args) { //Create a piramid giving a space between printed numbers and change between 1 and 0.
		// TODO Auto-generated method stub
		boolean cambio = true;
		int maxRow = 10, maxCol = maxRow * 2 + 1; //Ecuation for only change 1 value (maxRow)
		
		for (int raw = 0; raw < maxRow; raw++) {
			cambio = true;
			for (int col = 0; col < maxCol; col++)

				if (col >= maxCol / 2 - raw && col <= maxCol / 2 + raw) { //if the position is between values, print a char.
					if ((raw + col) % 2 == 0) // the space gived between chars.
						System.out.print(" ");
					else 
						if (cambio) // if cambio == true, print 1
						{
						System.out.print("1");
						cambio = false;
						}
						else // if cambio == f, print 0
						{
						System.out.print("0");
						cambio = true;
						}
					
				} else
					System.out.print(" ");
			System.out.println("");
		}
	}

}
