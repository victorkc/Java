
public class E14_Piramide {

	public static void main(String[] args) { // Create a cute piramid, similar to the christmas tree.
		// TODO Auto-generated method stub
		
		int maxRow = 10, maxCol = maxRow * 2 - 1; //Ecuation for only change 1 value (maxRow)
		
		for (int raw = 0; raw < maxRow; raw++) {
			for (int col = 0; col < maxCol; col++)

				if (col >= maxCol / 2 - raw && col <= maxCol / 2 + raw) //if the position is between values, print a char.
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println("");
		}

	}

}
