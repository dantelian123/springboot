package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Pelicula;
import com.example.demo.entities.Sala;

public interface SalaRepo extends JpaRepository<Sala, Integer> {

}
