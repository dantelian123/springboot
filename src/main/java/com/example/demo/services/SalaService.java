package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Sala;
import com.example.demo.repo.SalaRepo;

@Service
public class SalaService {
	
	@Autowired
	private SalaRepo salaRepo;
	
	public List<Sala> listar(){
		return this.salaRepo.findAll();
	}
	
	public Sala insertar(Sala sala) {
		return this.salaRepo.save(sala);
	}
	public Sala actualizar(Sala sala) {
		return this.salaRepo.save(sala);
	}
	public Optional<Sala> buscarPorId(int id){
		return this.salaRepo.findById(id);
	}
	public void eliminar(int id) {
		this.salaRepo.deleteById(id);
	}
}
