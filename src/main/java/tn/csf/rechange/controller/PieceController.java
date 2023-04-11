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

import tn.csf.rechange.model.Piece;
import tn.csf.rechange.service.PieceService;

//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class PieceController {

	//autowire the PieceService class  
	@Autowired  
	PieceService ps;  

	//creating a get mapping that retrieves all the Piece detail from the database   
	@GetMapping("/piece")
	private List<Piece> getAllPiece()   
	{  
		return ps.getAllPiece();  
	}  

	//creating a get mapping that retrieves the detail of a specific piece
		@GetMapping("/piece/{id}")  
		private Piece getPiece(@PathVariable("id") int id)   
		{  
			return ps.getPieceById(id);  
		}  

	//creating a delete mapping that deletes a specified piece 
	@DeleteMapping("/piece/{id}")  
	private void deletePiece(@PathVariable("id") int id)   
	{  
		ps.delete(id);  
	} 

	//create new Piece
	@PostMapping("/piece")  
	private int savepiece(@RequestBody Piece p)   
	{  
		ps.saveOrUpdate(p);  
		return p.getId();  
	} 

	//creating put mapping that updates the piece detail
	@PutMapping("/piece")  
	private Piece update(@RequestBody  Piece p)   
	{  
		ps.saveOrUpdate(p);  
		return p;  
	}  
}

