package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Recipe;



@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long>{

	List<Recipe> findByCuisine(String cuisine);
	List<Recipe> findByMealType(String mealType);
    List<Recipe> findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String name, String description);
}
