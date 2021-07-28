package com.unicomer.service;

import java.util.List;

import com.unicomer.domain.Perfil;


public interface IPerfilService {

	List<Perfil> findAll();
	Perfil findRecordById(Long id);
	Long save(Perfil perfil);


}
