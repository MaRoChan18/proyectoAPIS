package com.manu.miprimerspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manu.miprimerspringboot.model.entity.registro_musica;
import com.manu.miprimerspringboot.service.Iregistro_musica;

@RestController
@RequestMapping("/api/v1")
public class registro_musicaController {
	
	@Autowired
	private Iregistro_musica registro_musicaService;
	
	@PostMapping("registro_musica")
	public registro_musica create(@RequestBody registro_musica registro_musica) {
		return registro_musicaService.save(registro_musica);
	}
	//Crea un registro
	
	@PutMapping("registro_musica")
	public registro_musica update(@RequestBody registro_musica registro_musica) {
		return registro_musicaService.save(registro_musica);
	}
	//Modifica un registro
	
	@DeleteMapping("registro_musica/{id}")
	public void delete(@PathVariable Integer id) {
		registro_musica registro_musicaDelete = registro_musicaService.findById(id);
		registro_musicaService.delete(registro_musicaDelete);
	}
	//Borra un registro
	
	@GetMapping("registro_musica/{id}")
	public registro_musica showById(@PathVariable Integer id) {
		return registro_musicaService.findById(id);
	} 
	//Extraer por id
	
	@GetMapping("registro_musica")
	public Iterable<registro_musica>show () {
		return registro_musicaService.findAll();
	} 
	//Extraer todos los registros
}
