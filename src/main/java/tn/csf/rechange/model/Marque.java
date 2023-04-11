package tn.csf.rechange.model;


import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import tn.csf.rechange.model.Marque;  
 
@Entity  

@Table  

public class Marque {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;  
	@Column  
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Marque [id=" + id + ", name=" + name + "]";
	}
	
}