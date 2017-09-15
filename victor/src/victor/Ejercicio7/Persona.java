package victor.Ejercicio7;

public class Persona {
	String dni, nombre, apellidos;
	double salario;
	
	//constructor para trabajar con objetos
	public Persona(String dni, String nombre, String apellidos, double salario) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
	}

	//get & set para editar o sacar los datos de los objetos. Tienen que estar protegidos
	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}

	//ToString para sacar el objeto entero.
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario + "]";
	}
	
}
