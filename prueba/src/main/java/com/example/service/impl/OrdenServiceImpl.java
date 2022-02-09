package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Orden;
import com.example.repository.OrdenRepository;
import com.example.service.OrdenService;

@Service
public class OrdenServiceImpl implements OrdenService {

	@Autowired
	private OrdenRepository ordenRepository;
	
	@Override
	public void guardar(Orden orden) {
		this.ordenRepository.save(orden);
	}

	@Override
	public Orden obtener(Integer id) {		
		return this.ordenRepository.getById(id);
	}
	
	
}
