package cl.inacap.gestionCivilModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.gestionCivilModel.dto.Persona;

@Local
public interface PersonaDAOLocal {

	void save(Persona persona);
	List<Persona> getAll();
	void delete(Persona persona);
	List<Persona> filterByName(String nombre);
}
