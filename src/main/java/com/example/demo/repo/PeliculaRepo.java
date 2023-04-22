package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Pelicula;

public interface PeliculaRepo extends JpaRepository<Pelicula, Integer> {

//	@Query("SELECT p.nombre, p.duracion "
//			+ "FROM pelicula p JOIN pelicula_salacine ps "
//			+ "ON p.id_pelicula = ps.id_pelicula "
//			+ "WHERE p.id = :id AND p.nombre = :nombre")
//	Pelicula buscarPeliculaPorNombre(@Param("id") int idSala, @Param("nombre")String nombre);
}
