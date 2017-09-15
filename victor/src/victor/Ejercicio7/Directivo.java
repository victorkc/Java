package victor.Ejercicio7;

public class Directivo extends Persona{
	//1. variables
	protected boolean salesiano;
	protected String horario;
	
	//2. constructor
	public Directivo(String dni, String nombre, String apellidos, double salario, boolean salesiano, String horario) {
		super(dni, nombre, apellidos, salario);
		this.salesiano = salesiano;
		this.horario = horario;
	}

	//3. get & set
	protected boolean isSalesiano() {
		return salesiano;
	}

	protected void setSalesiano(boolean salesiano) {
		this.salesiano = salesiano;
	}

	protected String getHorario() {
		return horario;
	}

	protected void setHorario(String horario) {
		this.horario = horario;
	}

	//4. ToString
	@Override
	public String toString() {
		return "Directivo [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ ", salesiano=" + salesiano + ", horario=" + horario + "]";
	}

	
}
