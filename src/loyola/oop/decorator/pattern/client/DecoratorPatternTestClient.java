package loyola.oop.decorator.pattern.client;

import loyola.oop.decorator.pattern.Coffee;
import loyola.oop.decorator.pattern.RegularCoffee;
import loyola.oop.decorator.pattern.WithMocha;
import loyola.oop.decorator.pattern.WithWhipCream;
import loyola.oop.decorator.pattern.WithWholeMilk;

public class DecoratorPatternTestClient {
	
	public static void main(String[] args) {
		Coffee coffeeWithWholeMilk = new WithWholeMilk(new RegularCoffee());
		System.out.println("Coffee with Whole Milk costs : " + coffeeWithWholeMilk.getCost() + 
				"\t" + "Ingredients: " + coffeeWithWholeMilk.getIngredients());
		
		Coffee mocha = new WithMocha(new WithWholeMilk(new RegularCoffee()));
		System.out.println("Mocha Coffee costs : " + mocha.getCost() + 
				"\t" + "Ingredients: " + mocha.getIngredients());
		
		Coffee mochaWithWhipCream = new WithWhipCream(new WithMocha(new WithWholeMilk(new RegularCoffee())));
		System.out.println("Mocha With Whip Cream costs : " + mochaWithWhipCream.getCost() + 
				"\t" + "Ingredients: " + mochaWithWhipCream.getIngredients());
	}
}
