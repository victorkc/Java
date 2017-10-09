
public class Fecha {

	int dia=1, mes=12, anio=2011;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public String escribeCorta()
	{
		return dia + "/" + mes + "/" + anio;
	}
	
	public String escribeLarga() 
	{
		String mesNumero[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "noviembre", "Diciembre"};
		return "Día " + dia + " de " + mesNumero[mes-1] + " de " + anio;
	}
	
	public void correcta()
	{
		if(dia>0 && dia<31 && mes>0 && mes<13 && anio>1900 & anio<2018)
			System.out.println("La fecha es correcta");
		else
			System.out.println("La fecha no se correcta");
	}
	
	
}
