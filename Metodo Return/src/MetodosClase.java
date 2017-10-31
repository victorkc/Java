
public class MetodosClase {
	
	public static Fecha crearFecha()
	{
		return new Fecha();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f1, f2;

		f1 = crearFecha();
		f2 = crearFecha();
		
		f1.setDia(1);
		f1.setMes(1);
		f1.setAnio(1);
		
		f2.setDia(2);
		f2.setMes(2);
		f2.setAnio(2);
		
		System.out.println(f1.escribeCorto());
		System.out.println(f2.escribeCorto());
	
	}

}
