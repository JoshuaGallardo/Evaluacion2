package cl.inacap.gestionCivilApp.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.gestionCivilModel.dao.PersonaDAOLocal;
import cl.inacap.gestionCivilModel.dto.Persona;

/**
 * Servlet implementation class IngresarSolicitudController
 */
@WebServlet("/IngresarSolicitudController.do")
public class IngresarSolicitudController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private PersonaDAOLocal personasDAO1;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresarSolicitudController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("WEB-INF/vistas/ingresarSolicitud.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<String> errores = new ArrayList<>();
		
		String rut = request.getParameter("rut-txt").trim();
		if(rut.length() >10) {
			errores.add("El rut no debe superar los 10 caracteres");
		}
		String nombre = request.getParameter("nombre-txt").trim();
		if(nombre.isEmpty()) {
			errores.add("Ingrese un nombre y apellido");
		}
		String solicitud = request.getParameter("solicitud-select").trim();
		if(solicitud.isEmpty()) {
			errores.add("Seleccione una Solicitud");
		}
		if(errores.isEmpty()) {
			Persona persona = new Persona();
			persona.setRut(rut);
			persona.setNombre(nombre);
			persona.setSolicitud(solicitud);
			personasDAO1.save(persona);
			request.setAttribute("mensaje", "Solicitud ingresada con éxito");
		} else {
			request.setAttribute("Hubo uno o varios errores", errores);
		}
		
		
		doGet(request, response);
	}

}
