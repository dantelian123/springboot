package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Pelicula;
import com.example.demo.services.PeliculaService;

@RestController
@RequestMapping("/pelicula")
public class PerliculaController {

	@Autowired
	private PeliculaService peliculaService;

	@GetMapping
	public List<Pelicula> listar() {
		return this.peliculaService.listar();
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public Pelicula insertar(@RequestBody Pelicula pel) {
		return this.peliculaService.insertar(new Pelicula(pel.getNombre(), pel.getDuracion()));
	}

	@PutMapping
	public Pelicula actualizar(@RequestBody Pelicula pel) {
		return this.peliculaService.actualizar(new Pelicula(pel.getIdPelicula(), pel.getNombre(), pel.getDuracion()));
	}

	@GetMapping("/{id}")
	public Optional<Pelicula> buscarPorId(@PathVariable Integer id) {
		return this.peliculaService.buscarPorId(id);
	}
//	@GetMapping("/{id}/{nombre}")
//	public Pelicula buscarPorNombre(@PathVariable Integer id, @PathVariable String nombre) {
//		return this.peliculaService.buscarNombre(id, nombre);
//	}
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		this.peliculaService.eliminar(id);
	}

}
