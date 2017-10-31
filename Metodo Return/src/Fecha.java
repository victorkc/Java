
public class Fecha 
{
	private int dia, mes, anio;
	
	public Fecha()
	{
		dia=1;
		mes=1;
		anio=2000;
	}
	
	public void setDia(int d)
	{
		dia = d;
	}
	
	public void setMes(int d)
	{
		mes = d;
	}
	
	public void setAnio(int d)
	{
		anio = d;
	}
	
	public String escribeCorto()
	{
		return dia + "/" + mes + "/" + anio;
	}
	
	
	
	
	
}
