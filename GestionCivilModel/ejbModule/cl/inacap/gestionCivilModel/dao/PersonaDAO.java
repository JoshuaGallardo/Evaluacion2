package cl.inacap.gestionCivilModel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.gestionCivilModel.dto.Persona;

/**
 * Session Bean implementation class PersonaDAO
 */
@Stateless
@LocalBean
public class PersonaDAO implements PersonaDAOLocal {
	
	private static List<Persona> personas = new ArrayList<>();

	@Override
	public void save(Persona persona) {
		personas.add(persona);
	}

	@Override
	public List<Persona> getAll() {
		// TODO Auto-generated method stub
		return personas;
	}

	@Override
	public void delete(Persona persona) {
		// TODO Auto-generated method stub
		personas.remove(persona);
		
	}

	@Override
	public List<Persona> filterByName(String nombre) {
		// TODO Auto-generated method stub
		return personas.stream().filter(c->c.getNombre().contains(nombre)).collect(Collectors.toList());
	}

   

}
