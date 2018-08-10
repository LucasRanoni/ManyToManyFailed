package com.Lucas.ManyToManyCocina.Model;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.*;
import javax.persistence.OneToMany;

@Entity
public class Receta {
	@Id
	@GeneratedValue
	private long idReceta;
	private String nombreReceta;
	private String instruccion;
	
	@OneToMany(mappedBy="receta")
	private List<Receting> receting;
	
	public long getIdReceta() {
		return idReceta;
	}

	public void setIdReceta(long idReceta) {
		this.idReceta = idReceta;
	}

	public String getNombreReceta() {
		return nombreReceta;
	}

	public void setNombreReceta(String nombreReceta) {
		this.nombreReceta = nombreReceta;
	}

	public String getInstruccion() {
		return instruccion;
	}

	public void setInstruccion(String instruccion) {
		this.instruccion = instruccion;
	}



	public List<Receting> getReceting() {
		return receting;
	}

	public void setReceting(List<Receting> receting) {
		this.receting = receting;
	}

	public Receta() {
		// TODO Auto-generated constructor stub
	}

}
