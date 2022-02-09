package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Producto;
import com.example.repository.ProductoRepository;
import com.example.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;

	@Override
	public Producto actualizar(Producto producto) {
		return this.productoRepository.save(producto);
	}

	@Override
	public Producto obtener(Integer id) {
		return this.productoRepository.getById(id);
	}

}
