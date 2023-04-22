package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Pelicula;
import com.example.demo.repo.PeliculaRepo;

@Service
public class PeliculaService {

	@Autowired
	private PeliculaRepo peliculaRepo;
	
	public Pelicula insertar(Pelicula pelicula) {
		return peliculaRepo.save(pelicula);
	}
	public Pelicula actualizar(Pelicula pelicula) {
		System.out.println(pelicula.getIdPelicula());
		return peliculaRepo.save(pelicula);
	}
	public List<Pelicula> listar(){
		return peliculaRepo.findAll();
	}
	public Optional<Pelicula> buscarPorId(Integer id){
		return peliculaRepo.findById(id);
	}
	public void eliminar(Integer id) {
		System.out.println("eliminado registro...");
		peliculaRepo.deleteById(id);
	}
//	public Pelicula buscarNombre(int id, String nombre) {
//		return peliculaRepo.buscarPeliculaPorNombre(id, nombre);
//	}
}
