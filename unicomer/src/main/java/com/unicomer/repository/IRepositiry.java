package com.unicomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.unicomer.domain.Perfil;


@Repository
public interface IRepositiry extends JpaRepository<Perfil, Long>{

	@Query(value = "Select *from TblPerfil WHERE IdPerfil=:id", nativeQuery = true)
	Perfil findRecordById(@Param("id") Long id);
}
