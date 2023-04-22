package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Sala;

import com.example.demo.services.SalaService;

@RestController
@RequestMapping("/sala")
public class SalaController {

	@Autowired
	private SalaService salaService;

	@GetMapping
	public List<Sala> listar() {
		return this.salaService.listar();
	}
}
