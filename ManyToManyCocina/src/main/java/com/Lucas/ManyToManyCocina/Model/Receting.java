package com.Lucas.ManyToManyCocina.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Receting {
	@Id
	@GeneratedValue
	private long idReceting;
	private long cantidad;
	private String unidadMedida;
	@ManyToOne
	@JoinColumn(name="idReceta")
	private Receta receta;
	
	@ManyToOne
	@JoinColumn(name="idIngrediente")
	private Ingrediente ingrediente;
	
	public long getIdReceting() {
		return idReceting;
	}

	public void setIdReceting(long idReceting) {
		this.idReceting = idReceting;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
	


	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public Receta getReceta() {
		return receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	public Ingrediente getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}

	public Receting() {
		// TODO Auto-generated constructor stub
	}

}
