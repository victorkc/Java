
public class MetodoReturn {
	
	public static int buscarValor(int[] tabla, int valor)
	{
		for(int i=0;i<5;i++)
		{
			if(valor == tabla[i])
				return i;
		}
		return -1;
	}
	
	public static int buscarValor2(int[] tabla, int valor)
	{
		int devolver = -1;
		boolean encontrado=false;
		for(int i=0; i<5 && !encontrado ;i++)
		{
			if(valor == tabla[i]) 
			{
				devolver = i;
				encontrado=true;
			}
		}
		return devolver;
	}
	
	public static void escribirValores(int[] tabla) 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(tabla[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] miTabla1 = new int [5];
		int[] miTabla2 = { 12, 34, 44, 55, 19};

		int numero = buscarValor(miTabla2, 45);
		System.out.println("La posición es: " + numero);
		escribirValores(miTabla2);
	}

}
