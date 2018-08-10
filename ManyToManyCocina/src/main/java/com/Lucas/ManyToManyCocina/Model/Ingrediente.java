package com.Lucas.ManyToManyCocina.Model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Ingrediente {
	@Id
	@GeneratedValue
	private long idIngrediente;
	private String nombreIngrediente;
	
	@OneToMany(mappedBy="ingrediente")
	private List<Receting> receting;
	
	
	public long getIdIngrediente() {
		return idIngrediente;
	}


	public void setIdIngrediente(long idIngrediente) {
		this.idIngrediente = idIngrediente;
	}


	public String getNombreIngrediente() {
		return nombreIngrediente;
	}


	public void setNombreIngrediente(String nombreIngrediente) {
		this.nombreIngrediente = nombreIngrediente;
	}


	public List<Receting> getReceting() {
		return receting;
	}


	public void setReceting(List<Receting> receting) {
		this.receting = receting;
	}


	public Ingrediente() {
		// TODO Auto-generated constructor stub
	}

}
