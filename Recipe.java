package com.revature.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "recipe")
public class Recipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long recipeId;
	
	private String name;
	private String description;
	private String cuisine;
	private String mealType;
	
	private List<String> ingredients;
	
	@Lob
	private String instructions;
	
	private String imageUrl;
	
	

}
