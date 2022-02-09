package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Orden;
import com.example.service.OrdenService;

@RestController
public class OrdenController {

	@Autowired
	private OrdenService ordenService;
	
	@GetMapping(path="/{ordenId}")
	public Orden obtener(@PathVariable Integer id) {
		return this.ordenService.obtener(id);		
	}
	
	@PostMapping(path="/guardar")
	public int guardar(@RequestBody Orden orden ) {
		
		try{
			
			this.ordenService.guardar(orden);
			
		}catch (Exception e) {
			return 1;
		}
		
		return 0;
		
	}
}
