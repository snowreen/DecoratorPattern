package loyola.oop.decorator.pattern;

public class WithWholeMilk extends CoffeeDecorator {

	public WithWholeMilk(Coffee decoratedCoffee) {
		super(decoratedCoffee);
	}
	
	public double getCost() {
        return super.getCost() + 0.25;
    }

    public String getIngredients() {
        return super.getIngredients() + ", Whole Milk";
    }

}
