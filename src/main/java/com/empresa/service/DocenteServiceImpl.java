package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Docente;
import com.empresa.repository.DocenteRepository;

@Service
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	private DocenteRepository repository;

	
	@Override
	public List<Docente> listaDocentePorDniNombreUbigeo(String dni, String nombre, int idUbigeo) {
		return repository.listaDocentePorDniNombreUbigeo(dni, nombre, idUbigeo);
	}



}
