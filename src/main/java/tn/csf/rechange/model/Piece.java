package tn.csf.rechange.model;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import tn.csf.rechange.model.Piece;  
 
@Entity  

@Table  

public class Piece {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;  
	@Column  
	private String name;
	@Column
    private double price ;
	@Column
    private int quantity ;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="idType", referencedColumnName="id")
	private Type type;

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Piece [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", type=" + type
				+ "]";
	}    
}