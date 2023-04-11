package tn.csf.rechange.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.rechange.model.Piece;

 
//repository that extends CrudRepository  

public interface PieceRepository extends CrudRepository<Piece, Integer>  
{  
}  
