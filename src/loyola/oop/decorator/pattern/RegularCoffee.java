package loyola.oop.decorator.pattern;

public class RegularCoffee implements Coffee {

	@Override
	public double getCost() {
		return 1.00;
	}

	@Override
	public String getIngredients() {
		return "Coffee";
	}

}
