package tn.csf.rechange.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.csf.rechange.model.Marque;
import tn.csf.rechange.service.MarqueService;

//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class MarqueController {

	//autowire the marqueService class  
	@Autowired  
	MarqueService ms;  

	//creating a get mapping that retrieves all the Marque detail from the database   
	@GetMapping("/marque")
	private List<Marque> getAllMarque()   
	{  
		return ms.getAllMarque();  
	}  

	//creating a get mapping that retrieves the detail of a specific Marque
		@GetMapping("/marque/{id}")  
		private Marque getMarque(@PathVariable("id") int id)   
		{  
			return ms.getMarqueById(id);  
		}  

	//creating a delete mapping that deletes a specified Marque 
	@DeleteMapping("/marque/{id}")  
	private void deleteMarque(@PathVariable("id") int id)   
	{  
		ms.delete(id);  
	} 

	//create new Marque
	@PostMapping("/marque")  
	private int savemarque(@RequestBody Marque m)   
	{  
		ms.saveOrUpdate(m);  
		return m.getId();  
	} 

	//creating put mapping that updates the Marque detail
	@PutMapping("/marque")  
	private Marque update(@RequestBody  Marque m)   
	{  
		ms.saveOrUpdate(m);  
		return m;  
	}  
}

