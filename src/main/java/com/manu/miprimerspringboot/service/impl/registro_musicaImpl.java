package com.manu.miprimerspringboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.manu.miprimerspringboot.model.dao.registro_musicaDAO;
import com.manu.miprimerspringboot.model.entity.registro_musica;
import com.manu.miprimerspringboot.service.Iregistro_musica;

@Service
public class registro_musicaImpl implements Iregistro_musica{

	@Autowired
	private registro_musicaDAO registro_musicaDAO;
	
	@Transactional
	@Override
	public registro_musica save(registro_musica registro_musica) {
		// TODO Auto-generated method stub
		return registro_musicaDAO.save(registro_musica);
	}
	
	@Transactional(readOnly = true)
	@Override
	public registro_musica findById(Integer id) {
		// TODO Auto-generated method stub
		return registro_musicaDAO.findById(id).orElse(null);
	}
	@Transactional
	@Override
	public void delete(registro_musica registro_musica) {
		// TODO Auto-generated method stub
		registro_musicaDAO.delete(registro_musica);
	}
	@Transactional(readOnly = true)
	@Override
	public Iterable<registro_musica> findAll(){
		// TODO Auto-generated method stub
		return registro_musicaDAO.findAll(); 
	}
}
