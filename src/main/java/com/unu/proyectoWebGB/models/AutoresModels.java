package com.unu.proyectoWebGB.models;

import java.util.ArrayList;
import java.util.List;

import com.unu.proyectoWebGB.beans.Autor;

public class AutoresModels {
	public List<Autor> listarAutores(){
		ArrayList<Autor> autores = new ArrayList<>(); 
		autores.add(new Autor(1,"Garcia Marquez","Colombiano"));
		autores.add(new Autor(2,"Borges","Argentino"));
		autores.add(new Autor(1,"Allende","China"));
		return autores;
	}

}
