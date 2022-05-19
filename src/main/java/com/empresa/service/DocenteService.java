package com.empresa.service;

import java.util.List;

import com.empresa.entity.Docente;

public interface DocenteService {

	public abstract List<Docente> listaDocentePorNombreDniUbigeo(String dni, String nombre, int idUbigeo,int estado);

}
