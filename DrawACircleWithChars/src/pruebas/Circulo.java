package pruebas;

public class Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MAX = 30;
		double r = 36; //4*4
		double jx = 10, ky = 10;
//pow(double base, double exponente) EJ: Math.pow(2,3)
		for(double x=0; x<MAX; x++){
			System.out.println();
			for(double y=0; y<MAX; y++)
				if(Math.pow((x-jx), 2)+Math.pow((y-ky), 2)>= r-3 && Math.pow((x-jx), 2)+Math.pow((y-ky), 2)<=r+3)
					System.out.print("O");
				else
					System.out.print("  ");
		}

	}
}
