package com.majed.produit;





import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.majed.produit.entities.Categorie;
import com.majed.produit.entities.Produit;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	@Test
	public void testCreateProduit() {
		Produit prod =new Produit("pc ",15.00,new Date());
		produitRepository.save(prod);
	}
	@Test
	public void testFindProduit() {
		Produit p=produitRepository.findById(2L).get();
		
		System.out.println(p);
	}
	@Test
	public void testUpdateProduit() {
		Produit p=produitRepository.findById(4L).get();
		p.setPrixProduit(105.0);
		produitRepository.save(p);
		}
	@Test 
	public void testDeleteProduit() {
		produitRepository.deleteById(3L);
	}
	@Test
	public void testfindallProduits() {
		List<Produit> prods=produitRepository.findAll();
		
		for (Produit p:prods)
			System.out.println(p);
			
		
	}
	@Test
	public void testFindByNomProduit()
	{
	   List<Produit> prods = produitRepository.findByNomProduit("PC Samsung");
	   
	   for (Produit p : prods)
	  
	        System.out.println(p);
	  
	}
	@Test
	public void testFindByNomProduitContains ()
	{
	   List<Produit> prods=produitRepository.findByNomProduitContains("D");
	   
	   for (Produit p : prods)
	
	       System.out.println(p);
	   
	 }
	@Test
	public void testfindByNomPrix()
	{
	   List<Produit> prods = produitRepository.findByNomPrix("PC Dell",2200.5);
	   for (Produit p : prods) {
	
	       System.out.println(p);
	       }
	
	}
	
	@Test
	public void testfindByCategorie()
	{
	   Categorie cat = new Categorie();
	   cat.setIdCat(2L);
	
	   List<Produit> prods = produitRepository.findByCategorie(cat);
	   for (Produit p : prods)
	    {
	       System.out.println(p);
	    }
	}
	
	@Test
	public void findByCategorieIdCat()
	{
	   List<Produit> prods = produitRepository.findByCategorieIdCat(1L);
	   for (Produit p : prods)
	    {
	      System.out.println(p);
	    }
	 }
	
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
	   List<Produit> prods =
	   produitRepository.findByOrderByNomProduitAsc();
	   for (Produit p : prods)
	    {
	       System.out.println(p);
	    }
	}
	
	@Test
	public void testTrierProduitsNomsPrix()
	{
	   List<Produit> prods = produitRepository.TrierProduitsNomsPrix();
	   for (Produit p : prods)
	    {
	       System.out.println(p);
	    }
	}


	

}
