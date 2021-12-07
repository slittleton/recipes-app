package com.example.recipes.services;

import com.example.recipes.commands.RecipeCommand;
import com.example.recipes.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;



public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
