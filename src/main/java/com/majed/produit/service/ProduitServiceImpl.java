package com.majed.produit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.majed.produit.ProduitRepository;
import com.majed.produit.entities.Categorie;
import com.majed.produit.entities.Produit;
@Service
public class ProduitServiceImpl implements ProduitService {
	@Autowired
    ProduitRepository produitrepository;
	@Override
	public Produit saveProduit(Produit p) {
		
		return produitrepository.save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {
		
		return produitrepository.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		produitrepository.delete(p);
		
	}

	@Override
	public void deleteProduitById(Long id) {
		produitrepository.deleteById(id);
		
	}

	@Override
	public Produit getProduit(Long id) {
		
		return produitrepository.findById(id).get();
	}

	@Override
	public List<Produit> getAllProduit() {
		
		return produitrepository.findAll();
	}
	@Override
	public List<Produit> findByNomProduit(String nom) {
	return produitrepository.findByNomProduit(nom);
	}
	@Override
	public List<Produit> findByNomProduitContains(String nom) {
	return produitrepository.findByNomProduitContains(nom);
	}
	@Override
	public List<Produit> findByNomPrix(String nom, Double prix) {
		return produitrepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Produit> findByCategorie(Categorie categorie) {
	return produitrepository.findByCategorie(categorie);
	}
	@Override
	public List<Produit> findByCategorieIdCat(Long id) {
	return produitrepository.findByCategorieIdCat(id);
	}
	@Override
	public List<Produit> findByOrderByNomProduitAsc() {
	return produitrepository.findByOrderByNomProduitAsc();
	}
	@Override
	public List<Produit> TrierProduitsNomsPrix() {
	return produitrepository.TrierProduitsNomsPrix();
	}
	

}
