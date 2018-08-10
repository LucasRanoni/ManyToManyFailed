package com.Lucas.ManyToManyCocina.Model;

public class Formulario {
	Receta receta = new Receta();
	Receting receting1 = new Receting();
	Receting receting2 = new Receting();
	Receting receting3 = new Receting();
	public Receta getReceta() {
		return receta;
	}
	public void setReceta(Receta receta) {
		this.receta = receta;
	}
	public Receting getReceting1() {
		return receting1;
	}
	public void setReceting1(Receting receting1) {
		this.receting1 = receting1;
	}
	public Receting getReceting2() {
		return receting2;
	}
	public void setReceting2(Receting receting2) {
		this.receting2 = receting2;
	}
	public Receting getReceting3() {
		return receting3;
	}
	public void setReceting3(Receting receting3) {
		this.receting3 = receting3;
	}
	public Formulario() {
		// TODO Auto-generated constructor stub
	}

}
