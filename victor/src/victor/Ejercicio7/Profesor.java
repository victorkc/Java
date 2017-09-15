package victor.Ejercicio7;

public class Profesor extends Persona {
	//1. variables
	protected int numeroAsig;
	protected boolean tutor;
	
	//2. constructor
	public Profesor(String dni, String nombre, String apellidos, double salario, int numeroAsig, boolean tutor) {
		super(dni, nombre, apellidos, salario);
		this.numeroAsig = numeroAsig;
		this.tutor = tutor;
	}
	
	//3. get & set
	protected int getNumeroAsig() {
		return numeroAsig;
	}

	protected void setNumeroAsig(int numeroAsig) {
		this.numeroAsig = numeroAsig;
	}

	protected boolean isTutor() {
		return tutor;
	}

	protected void setTutor(boolean tutor) {
		this.tutor = tutor;
	}

	//4. ToString
	@Override
	public String toString() {
		return "Profesor [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ ", numeroAsig=" + numeroAsig + ", tutor=" + tutor + "]";
	}
	

	
	
	

}
