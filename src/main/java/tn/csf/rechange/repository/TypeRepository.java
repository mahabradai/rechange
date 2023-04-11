package tn.csf.rechange.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.rechange.model.Type;

 
//repository that extends CrudRepository  

public interface TypeRepository extends CrudRepository<Type, Integer>  
{  
}  
