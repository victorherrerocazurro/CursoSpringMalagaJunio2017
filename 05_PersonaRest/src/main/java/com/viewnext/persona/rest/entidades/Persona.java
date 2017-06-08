package com.viewnext.persona.rest.entidades;

import java.io.Serializable;
import java.util.Date;

public class Persona implements Serializable{

	private String nombre;
	private Date fechaNacimiento;
	private int dni;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public Persona(String nombre, Date fechaNacimiento, int dni) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
	}
	public Persona() {
		super();
	}
	
}
