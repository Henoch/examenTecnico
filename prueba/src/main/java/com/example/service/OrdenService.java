package com.example.service;

import com.example.model.Orden;

public interface OrdenService {
	void guardar(Orden orden);
	Orden obtener(Integer id);
}
