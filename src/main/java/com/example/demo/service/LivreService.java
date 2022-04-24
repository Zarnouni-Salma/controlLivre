package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Livre;
import com.example.demo.repos.LivreRepos;
@Component
public class LivreService {
	@Autowired
    LivreRepos livreRepos;

	
	public List<Livre>getLivres(){
		
		return livreRepos.findAllByOrderByDateSortieAsc();
		
	}
	public Livre getLivre(int id) {
		return livreRepos.findById(id).get();
	}
	public Livre updateLivre(int id,Livre data)
	{
		Livre livre=getLivre(id);
		livre.setAuteur(data.getAuteur());
		livre.setDateSortie(data.getDateSortie());
		livre.setDerniereConsultation(data.getDerniereConsultation());
		livre.setDisponible(data.isDisponible());
		livre.setNbrPage(data.getNbrPage());
		livre.setTitre(data.getTitre());
		return livreRepos.save(livre);
	}
	@Transactional
	public void deleteLivre(int id)
	{
		livreRepos.deleteById(id);
		
	}
	
	
	
}
