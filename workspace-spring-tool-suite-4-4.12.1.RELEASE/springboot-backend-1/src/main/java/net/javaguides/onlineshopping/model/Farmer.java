package net.javaguides.onlineshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Farmer")

public class Farmer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="farmer_product")
	private String farmer_product;
	
	@Column(name="phno")
	private String phno;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	

}
