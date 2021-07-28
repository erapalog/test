package com.unicomer.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unicomer.domain.Perfil;
import com.unicomer.repository.IRepositiry;
import com.unicomer.service.IPerfilService;



@Service
public class PerfilServiceImp implements IPerfilService{
	
	@Autowired
	private IRepositiry repository;
	
	
	@Override
	public List<Perfil> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Perfil findRecordById(Long id) {
		return repository.findRecordById(id);
	}
	
	@Transactional
	public Long save(Perfil perfil) {
		long key = 0;
		//Long id;
		
		try {
		//	Perfil insertPerfil = repository.saveAndFlush(perfil);
			repository.saveAndFlush(perfil);
			
			//obtener el ID del perfil insertado
			//id=insertPerfil.getIdPerfil();
			//System.out.print(id);
		}
		catch(Exception ex) {
			key = -1;
		}
		return key;
		
		
	
	}
	
}
