package tn.csf.rechange.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.rechange.model.Type;
import tn.csf.rechange.repository.TypeRepository;


//defining the business logic  
@Service 

public class TypeService {

	@Autowired  
	TypeRepository tR;  

	//getting all Type record by using the method findaAll() of CrudRepository  
	public List<Type> getAllType()   
	{  
		List<Type> type = new ArrayList<Type>();  
		tR.findAll().forEach(t  -> type.add(t));  
		return type;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Type getTypeById(int id)   
	{  
		return tR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Type t)   
	{  
		tR.save(t);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		tR.deleteById(id);  
	} 

}
