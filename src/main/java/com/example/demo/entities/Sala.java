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
@Data
@Entity
@Table(name="sala_cine")
public class Sala {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id_sala")
	private int idSala;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "estado")
	private double estado;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "sala") 
	private List<PeliculaSala> peliculaSala = new ArrayList<>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getEstado() {
		return estado;
	}

	public void setEstado(double estado) {
		this.estado = estado;
	}

	public List<PeliculaSala> getPeliculaSala() {
		return peliculaSala;
	}

	public void setPeliculaSala(List<PeliculaSala> peliculaSala) {
		this.peliculaSala = peliculaSala;
	}

	public int getIdSala() {
		return idSala;
	}

	@Override
	public String toString() {
		return "Sala [idSala=" + idSala + ", nombre=" + nombre + ", estado=" + estado + ", peliculaSala=" + peliculaSala
				+ "]";
	}
	
	
}
