package com.ecommerce.microcommerce.web.controller;
import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.model.Product;
import com.ecommerce.microcommerce.model.User;
import com.ecommerce.microcommerce.repository.UserRepository;

import com.ecommerce.microcommerce.model.Identifiant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;


@Controller
public class ProductController {

//	UserRepository userRepository;
	
    @Autowired
    private ProductDao productDao;
    
    @Value("${welcome.message:test}")
    private String message = "Hello World";
    
    //Récupérer la liste des produits
    @RequestMapping(value="/Produits", method=RequestMethod.GET)
    public List<Product>listeProduits() {
        return productDao.findAll();
    }

    //Récupérer un produit par son Id
    @GetMapping(value="/Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id) {
        return productDao.findById(id);
    }
    
    // Test HelloWorld
    @GetMapping(value="/hello")
    public String sayHello() {
    	return "Hello";
    }
    
    //Afficher la page de Connexion
    @GetMapping(value="/Connexion")
    public String afficherConnexion() {
    	return "Connexion";
    }
    
    
    // se connecter
    @GetMapping(value = "/HomeConnexion")
    public String Connexion(@RequestParam String identifiant, @RequestParam String mdp) {
         return "Home";
    }
    
    
    @PostMapping(value ="/Connexion")
    public String Connexion2(Model model, @ModelAttribute("Identifiant") Identifiant identifiant1, BindingResult result, final RedirectAttributes redirectAttributes) {
    	
    	//System.out.println(identifiant1.getIdentifiant());
    	//System.out.println(identifiant1.getMdp());
    	//redirectAttributes.addFlashAttribute("flashIdentifiant", identifiant1);
    	
    	String identifiant = identifiant1.getIdentifiant();
    	String mdp = identifiant1.getMdp();
    	
    	
    	
    	 	
    	
    	if (identifiant.equals("cyprien") && mdp.equals("miga")) {
    		
    		return "/Home";}
    	else {
    		return "Error";}
    }
    
//    @GetMapping("/user")
//    public List<User> getAllUser() {
//        return userRepository.findAll();
//    }
//    
    
    
}