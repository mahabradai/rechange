package tn.csf.rechange.repository;


import org.springframework.data.repository.CrudRepository;

import tn.csf.rechange.model.Marque;

 
//repository that extends CrudRepository  

public interface MarqueRepository extends CrudRepository<Marque, Integer>  
{  
}  
