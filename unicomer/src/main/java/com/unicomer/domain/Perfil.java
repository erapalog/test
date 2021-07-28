package com.unicomer.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TblPerfil")
public class Perfil {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdPerfil", length = 100, nullable = false)
	private Long idPerfil;
	
	@Column(name = "NombrePerfil", length = 100, nullable = false)	
	private String nombrePerfil;
	
	@Column(name = "DescripcionPerfil", length = 100, nullable = false)	
	private String descripcionPerfil;
	
	@Column(name = "Estado", length = 100, nullable = false)	
	private Integer estado;
	                
	@Column(name = "FechaModificacion", length = 100, nullable = false)
	private Date fechaModificacion;
	
	
	public Long getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(Long idPerfil) {
		this.idPerfil = idPerfil;
	}
	
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public String getNombrePerfil() {
		return nombrePerfil;
	}
	public void setNombrePerfil(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}
	public String getDescripcionPerfil() {
		return descripcionPerfil;
	}
	public void setDescripcionPerfil(String descripcionPerfil) {
		this.descripcionPerfil = descripcionPerfil;
	}
}
