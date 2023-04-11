package tn.csf.rechange.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.rechange.model.Marque;
import tn.csf.rechange.repository.MarqueRepository;


//defining the business logic  
@Service 

public class MarqueService {

	@Autowired  
	MarqueRepository mR;  

	//getting all Marque record by using the method findaAll() of CrudRepository  
	public List<Marque> getAllMarque()   
	{  
		List<Marque> marque = new ArrayList<Marque>();  
		mR.findAll().forEach(m  -> marque.add(m));  
		return marque;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Marque getMarqueById(int id)   
	{  
		return mR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Marque m)   
	{  
		mR.save(m);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		mR.deleteById(id);  
	} 

}
