package cl.inacap.gestionCivilModel.dto;

public class Persona {

	private String nombre;
	private String rut;
	private String Solicitud;
	private int nroAtencion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getSolicitud() {
		return Solicitud;
	}
	public void setSolicitud(String solicitud) {
		Solicitud = solicitud;
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
