package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="pelicula_salacine")
public class PeliculaSala {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id_pelicula_sala")
	private int idPeliculaSala;
	
	
	
	@Column(name = "fecha_publicacion")
	private Date fechaPublicacion;
	
	@Column(name = "fecha_fin")
	private Date fechaFin;
	
	@ManyToOne
	@JoinColumn(name="id_sala_cine", referencedColumnName = "id_sala")
	private Sala sala;
	
	@ManyToOne
	@JoinColumn(name="id_pelicula", referencedColumnName = "id_pelicula")
	private Pelicula pelicula;

	@Override
	public String toString() {
		return "PeliculaSala [idPeliculaSala=" + idPeliculaSala + ", fechaPublicacion=" + fechaPublicacion
				+ ", fechaFin=" + fechaFin + ", sala=" + sala + ", pelicula=" + pelicula + "]";
	}

	
	
	
	
}
