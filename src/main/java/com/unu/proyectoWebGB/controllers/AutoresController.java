package com.unu.proyectoWebGB.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.unu.proyectoWebGB.models.AutoresModels;

/**
 * Servlet implementation class AutoresController
 */
public class AutoresController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    AutoresModels modelo =  new AutoresModels();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutoresController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
    	if(request.getParameter("op")==null) {
    		listar(request,response);
    		return;
    	}
    	String operacion = request.getParameter("op");
    	switch (operacion) {
		case "listar": {
			listar(request,response);
			break;
		}
		case "nuevo": {
			//nuevo()
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
    }

    private void listar(HttpServletRequest request, HttpServletResponse response) {
    	request.setAttribute("listaAutores", modelo.listarAutores());
    	request.getRequestDispatcher("/autores/listarAutores.jsp");
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
