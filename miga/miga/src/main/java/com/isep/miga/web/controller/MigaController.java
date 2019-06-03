package com.isep.miga.web.controller;

import com.isep.miga.model.Identifiant;

import com.isep.miga.model.Reclamation;
import com.isep.miga.model.User;
import com.isep.miga.model.Vote;
import com.isep.miga.repository.UserRepository;
import com.isep.miga.repository.reclamationRepository;
import com.isep.miga.dao.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.List;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;



@Controller

public class MigaController {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	reclamationRepository reclamationRepository;
	@Autowired
    private ReclamationDao reclamationDAO;
//	@Autowired
//	private UserDao userDAO;
	
    
//    @Value("${welcome.message:test}")
//    private String message = "Hello World";
    
    //Récupérer la liste des produits
//    @RequestMapping(value="/Produits", method=RequestMethod.GET)
//    public List<Product>listeProduits() {
//        return productDao.findAll();
//    }
//
//    //Récupérer un produit par son Id
//    @GetMapping(value="/Produits/{id}")
//    public Product afficherUnProduit(@PathVariable int id) {
//        return productDao.findById(id);
//    }
    
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
    
    @GetMapping(value = "/reclamation")
    public String reclamationList(Model model) {
 
    	List<Reclamation> reclamations = getAllReclamation();
    	
       
        Reclamation temps;
        
        for (int i=reclamations.size(); i>0;i--) {
        	for (int j =1; j<i;j++) {
        		if (reclamations.get(j-1).getNombre_vote() < reclamations.get(j).getNombre_vote()) {
        			temps = reclamations.get(j-1);
        			reclamations.set(j-1, reclamations.get(j));
        			reclamations.set(j,temps);
        		}
        	}
        	
        }
        model.addAttribute("reclamations", reclamations);
        
        return "Home";
    }
    
    // se connecter
    @GetMapping(value = "/HomeConnexion")
    public String Connexion(@RequestParam String identifiant, @RequestParam String mdp) {
         return "Home";
    }
    
    
    @PostMapping(value ="/Connexion")
    public String Connexion2(Model model, @ModelAttribute("Identifiant") Identifiant identifiant1, BindingResult result, final RedirectAttributes redirectAttributes) {
    	

    	String identifiant = identifiant1.getIdentifiant();
    	String mdp = identifiant1.getMdp();
    	List<User> liste_User = getAllUser();
    	
    	for (int i=0; i<liste_User.size(); i++) {
    		
    		if (liste_User.get(i).getFirstName().equals(identifiant) && liste_User.get(i).getPassword().equals(mdp)) {
    			
    			//userDAO.findById(id)
    			
    			//Chercher le user_Id en fonction
    			//session.setAttribute("id", user.getId() );
    			
    			return "redirect:/reclamation";
    		}
    		
    			
    	}
    	
    	return "Error";
    	
    }
//    @GetMapping("/")
//    public String process(Model model, HttpSession session) {
//        @SuppressWarnings("unchecked")
//        List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");
//
//        if (messages == null) {
//            messages = new ArrayList<>();
//        }
//        model.addAttribute("sessionMessages", messages);
//
//        return "index";
//    }
//    
    //@PostMapping(value="/Ajouter_Reclamation")
    @RequestMapping(
    		  value = "/Ajouter_Reclamation", 
    		  method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String reclamation(Model model, @ModelAttribute("Reclamation") Reclamation reclamation1, BindingResult result, final RedirectAttributes redirectAttributes) {
    	
    	
    	
    	if (reclamation1.getTitre() != "" && reclamation1.getDescription() != "") {
    		
    		updateReclamation(reclamation1);
    		return "Reclamation_Sucess";
    		}
    	else
    		return "Error";
    }
    
    @PutMapping (value = "/Reclamation_BDD")
    public void updateReclamation(Reclamation reclamation) {
    	
        reclamationDAO.save(reclamation);
        
        
    }
    
    @GetMapping(value="/proposer")
    public String Proposer(Model model) {
    	List<Reclamation> reclamations = getAllReclamation();
    	
        
        Reclamation temps;
        
        for (int i=reclamations.size(); i>0;i--) {
        	for (int j =1; j<i;j++) {
        		if (reclamations.get(j-1).getNombre_vote() < reclamations.get(j).getNombre_vote()) {
        			temps = reclamations.get(j-1);
        			reclamations.set(j-1, reclamations.get(j));
        			reclamations.set(j,temps);
        		}
        	}
        	
        }
        model.addAttribute("reclamations", reclamations);
    	return "Proposer";
    }
    
    
    @PostMapping(value = "/Voter")
    public String Vote(@ModelAttribute("Vote") Vote vote) {

    	System.out.println(vote.getId_Reclamation());
    	int id = vote.getId_Reclamation();
    	
    	

    	
    	Reclamation reclamation1 = reclamationDAO.findById(id);
    	
    	Voter(reclamation1);
    	
    	return ("redirect:/reclamation");
    }
    
    
    
    public void Voter(Reclamation reclamation) {
    	int nombreVote = reclamation.getNombre_vote();
    	System.out.println(nombreVote);
    	reclamation.setNombre_vote(nombreVote + 1);
    	System.out.println(reclamation.getNombre_vote());
    	reclamationDAO.save(reclamation);
    }
    
    @ResponseBody
    @GetMapping(value ="/user")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
    
    @ResponseBody
    public List<Reclamation> getAllReclamation(){
    	return reclamationRepository.findAll();
    }
    

    
}