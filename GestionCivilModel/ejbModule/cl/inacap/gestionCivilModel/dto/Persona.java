package cl.inacap.gestionCivilModel.dto;

public class Persona {

	private String nombre;
	private String apellido;
	private String rut;
	private int nroAtencion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public int getNroAtencion() {
		return nroAtencion;
	}
	public void setNroAtencion(int nroAtencion) {
		this.nroAtencion = nroAtencion;
	}
	
	
}
