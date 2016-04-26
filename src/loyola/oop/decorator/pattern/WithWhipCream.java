package loyola.oop.decorator.pattern;

public class WithWhipCream extends CoffeeDecorator {

	public WithWhipCream(Coffee decoratedCoffee) {
		super(decoratedCoffee);
	}
	
	public double getCost() {
        return super.getCost() + 0.50;
    }

    public String getIngredients() {
        return super.getIngredients() + ", Whip Cream";
    }

}
