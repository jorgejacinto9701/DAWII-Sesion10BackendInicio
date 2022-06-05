package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Docente;

public interface DocenteService {

	//Para la consulta
	public abstract List<Docente> listaDocentePorNombreDniUbigeo(String dni, String nombre, int idUbigeo,int estado);

	//Para el Crud
	public abstract Docente insertaActualizaDocente(Docente docente);
	public abstract List<Docente> listaDocentePorNombreLike(String nombre);
	public abstract void eliminaDocente(int id);
	public abstract Optional<Docente> buscaDocente(int id);
	
	
	
}
