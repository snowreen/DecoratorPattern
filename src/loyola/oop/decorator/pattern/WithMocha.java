package loyola.oop.decorator.pattern;

public class WithMocha extends CoffeeDecorator {

	public WithMocha(Coffee decoratedCoffee) {
		super(decoratedCoffee);
	}
	
	public double getCost() {
        return super.getCost() + 1.00;
    }

    public String getIngredients() {
        return super.getIngredients() + ", Mocha";
    }

}
