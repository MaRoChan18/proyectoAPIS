package com.manu.miprimerspringboot.service;

import com.manu.miprimerspringboot.model.entity.registro_musica;

public interface Iregistro_musica {
	registro_musica save(registro_musica registro_musica);
	
	registro_musica findById(Integer id);
	
	void delete(registro_musica registro_musica);
	
	Iterable<registro_musica> findAll();
}
