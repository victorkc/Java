package clasesHerencias;

public class Coche {

	//Atributos
	private int nCaballos, marcha;
	private String direccion, matricula;

	//Constructor
	public Coche() //AL CREAR UN NUEVO OBJETO, COMIENZA CON ESTOS VALORES PREDEFINIDOS. EJ: NAVES DE LA MISMA CLASE.	
	{
		setnCaballos(5);
		direccion = "PARADO";
		marcha = 0;
		matricula = "DESCONOCIDA";
	}
	
	public Coche(int nCaballos, String direccion, int marcha, String matricula)
	{
		this.setnCaballos(nCaballos);
		this.direccion = direccion;
		this.marcha = marcha;
		this.matricula = matricula;
	}
	
	public void Arrancar()
	{
		this.direccion = "DELANTE";
		this.marcha++;
	}
	
	public void girar(String direccion)
	{
		if(direccion.equals("I"))
			this.direccion = "IZQUIERDA";
		else
			this.direccion = "DERECHA";
	}
	
	public void parar()
	{
		this.marcha = 0;
		this.direccion = "PARADO";
	}
	
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}
	
	public String estado()
	{
		return "Caballos: " + getnCaballos() + 
				" Dirección: " + direccion + 
				" Marcha: " + marcha + 
				" Matrícula: " + matricula;
	}
	
	
	
	public int getnCaballos() {
		return nCaballos;
	}

	public void setnCaballos(int nCaballos) {
		this.nCaballos = nCaballos;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public String getDireccion() {
		return direccion;
	}
	
	

	
	
}
