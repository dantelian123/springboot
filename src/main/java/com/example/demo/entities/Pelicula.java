package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "pelicula")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pelicula")
	private int idPelicula;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "duracion")
	private double duracion;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "pelicula")
	private List<PeliculaSala> peliculaSala = new ArrayList<>();

	public String getNombre() {
		return nombre;
	}
	
	public Pelicula() {
		super();
	}
	
	public Pelicula(int idPelicula) {
		super();
		this.idPelicula = idPelicula;
	}

	public Pelicula(String nombre, double duracion) {
		super();
		this.nombre = nombre;
		this.duracion = duracion;
	}

	public Pelicula(int idPelicula, String nombre, double duracion) {
		super();
		this.idPelicula = idPelicula;
		this.nombre = nombre;
		this.duracion = duracion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getIdPelicula() {
		return idPelicula;
	}
	
	



	@Override
	public String toString() {
		return "Pelicula [idPelicula=" + idPelicula + ", nombre=" + nombre + ", duracion=" + duracion
			+ ", peliculaSala=" + peliculaSala + "]";
	}

	

	
}
