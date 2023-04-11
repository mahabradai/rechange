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

import tn.csf.rechange.model.Type;
import tn.csf.rechange.service.TypeService;

//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class TypeController {

	//autowire the typeService class  
	@Autowired  
	TypeService ts;  

	//creating a get mapping that retrieves all the Type detail from the database   
	@GetMapping("/type")
	private List<Type> getAllType()   
	{  
		return ts.getAllType();  
	}  

	//creating a get mapping that retrieves the detail of a specific Type
		@GetMapping("/type/{id}")  
		private Type getType(@PathVariable("id") int id)   
		{  
			return ts.getTypeById(id);  
		}  

	//creating a delete mapping that deletes a specified Type 
	@DeleteMapping("/type/{id}")  
	private void deleteType(@PathVariable("id") int id)   
	{  
		ts.delete(id);  
	} 

	//create new Type
	@PostMapping("/type")  
	private int savetype(@RequestBody Type t)   
	{  
		ts.saveOrUpdate(t);  
		return t.getId();  
	} 

	//creating put mapping that updates the Type detail
	@PutMapping("/type")  
	private Type update(@RequestBody  Type t)   
	{  
		ts.saveOrUpdate(t);  
		return t;  
	}  
}

