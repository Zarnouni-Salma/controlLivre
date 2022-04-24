package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.example.demo.entities.Livre;
import com.example.demo.service.LivreService;

@RestController @RequestMapping("emsi_api/livres")
public class LivreController {
	@Autowired
LivreService livreService;
	@GetMapping()
	List<Livre>getLivres()
	{
		return livreService.getLivres();
	}
	@GetMapping("/{id}")
	Livre getLivre(@PathVariable int id) {
		return livreService.getLivre(id);
	}
	@PutMapping("/{id}")
	Livre updateLivre(@PathVariable int id,@RequestBody Livre livre)
	{
		return livreService.updateLivre(id, livre);
	}
	@DeleteMapping("/{id}")
	void deleteLivre(@PathVariable int id)
	{
		livreService.deleteLivre(id);
	}
	
	
	
}
