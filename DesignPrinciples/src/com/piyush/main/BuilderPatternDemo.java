package com.piyush.main;

import java.util.logging.Logger;

import com.piyush.builder.Meal;
import com.piyush.builder.MealBuilder;

public class BuilderPatternDemo {
	
	private static Logger logger = Logger.getLogger(BuilderPatternDemo.class.getName());
	public static void main(String[] args) {

			 MealBuilder mealBuilder = new MealBuilder();
			 Meal vegMeal = mealBuilder.prepareVegMeal();
			 logger.info("Veg Meal");

			 
			 vegMeal.showItems();
			 logger.info( "Total Cost: "+vegMeal.getCost());

		 }
}
