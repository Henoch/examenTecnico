package com.example.service;

import com.example.model.Producto;

public interface ProductoService {
	Producto actualizar(Producto producto);
	Producto obtener(Integer id);
}
