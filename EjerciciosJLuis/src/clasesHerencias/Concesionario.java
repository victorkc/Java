package clasesHerencias;

public class Concesionario {
	
	public static void ordenar(Coche c1, Coche c2, Coche c3) //Escribir por pantalla los coches ordenados por nº caballos de - a +
	{
		
		if(c1.getnCaballos()>c2.getnCaballos() && c1.getnCaballos()>c3.getnCaballos() && c2.getnCaballos()>c3.getnCaballos())
		{
				System.out.println("c1 > c2 >c3");
		}
		if(c2.getnCaballos()>c1.getnCaballos() && c2.getnCaballos()>c3.getnCaballos() && c1.getnCaballos()>c3.getnCaballos())
		{
			System.out.println("c2 > c1 > c3");
		}
		if(c3.getnCaballos()>c1.getnCaballos() && c3.getnCaballos()>c2.getnCaballos() && c2.getnCaballos()>c1.getnCaballos())
		{
			System.out.println("c3 > c2 > c1");
		}
		if(c1.getnCaballos()>c3.getnCaballos() && c1.getnCaballos()>c2.getnCaballos() && c3.getnCaballos()>c2.getnCaballos())
		{
			System.out.println("c1 > c3 > c2");
		}
		if(c2.getnCaballos()>c1.getnCaballos() && c2.getnCaballos()>c3.getnCaballos() && c3.getnCaballos()>c1.getnCaballos())
		{
			System.out.println("c2 > c3 > c1");
		}
		if(c3.getnCaballos()>c1.getnCaballos() && c3.getnCaballos()>c2.getnCaballos() && c1.getnCaballos()>c2.getnCaballos())
		{
			System.out.println("c3 > c1 > c2");
		}
	}
	
	public static void retirar(Coche c1, Coche c2, Coche c3) //Retirar todos los coches del concesionario, las matrículas pasan a valer 0000XXX
	{
		c1.setMatricula("0000XXX");
		c2.setMatricula("0000XXX");
		c3.setMatricula("0000XXX");
	}
	
	public static void funcionamiento(Coche c1, Coche c2, Coche c3) //Comprobar el funcionamiento de los vehículos "PARADOS" fijando la marcha a 0
	{
		if(c1.getDireccion().equals("PARADO"))
			c1.setMarcha(0);
		if(c2.getDireccion().equals("PARADO"))
			c2.setMarcha(0);
		if(c3.getDireccion().equals("PARADO"))
			c3.setMarcha(0);
	}
	

	public static void main(String[] args) 
	{
		
		Coche   c1 = new Coche(100, "DELANTE", 0, "3452HRF"),
				c2 = new Coche(150, "DELANTE", -1, "5273FHR"),
				c3 = new Coche(460,	"ATRAS", -1, "7583FHU");

		c1.Arrancar();
		c1.girar("D");
		
		c2.girar("I");
		
		c3.Arrancar();
		c3.girar("I");
		c3.parar();
		
		c1.setDireccion("NINGUNA");
		
		ordenar(c1, c2, c3);
		retirar(c1, c2, c3);
		funcionamiento(c1, c2, c3);
		
		System.out.println(c1.estado());
		System.out.println(c2.estado());
		System.out.println(c3.estado());
	
		
	}

}
