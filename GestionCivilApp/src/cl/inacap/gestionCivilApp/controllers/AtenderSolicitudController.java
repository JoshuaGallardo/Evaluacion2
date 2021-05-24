package cl.inacap.gestionCivilApp.controllers;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.inacap.gestionCivilModel.dao.PersonaDAOLocal;



/**
 * Servlet implementation class AtenderSolicitudController
 */
@WebServlet("/AtenderSolicitudController.do")
public class AtenderSolicitudController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Inject
	private PersonaDAOLocal personasDAO2;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AtenderSolicitudController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("WEB-INF/vistas/atenderSolicitud.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
