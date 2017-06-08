package com.viewnext.holamundo.javaconfig.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

public class Persona implements Serializable{

	@NotEmpty(message="Hay que rellenar el campo nombre")
	private String nombre;
	private Date fechaNacimiento;
	@Min(0)
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
