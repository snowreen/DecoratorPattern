I have implemented decorator pattern here and I have used example of making different coffee with adding different ingredients.

#Why

Suppose, I have a coffee shop. I sale regular coffee, regular coffee with milk, mocha coffee, and mocha with whip cream.
Here I need to have capability of adding new ingredients without making change of existing classes, and after adding ingredients I need to calculate my price. Thats why I have used decorator pattern here, so that I can decorate a cup of regular coffee with different ingredients.

#Implementation

Here I have Coffee interface which provides getCost and getIngredients methods. RegularCoffee directly implements Coffee and has implementation of the base cost and ingredients for a regular cup of coffee. Now I made CoffeeDecorator which is abstract class (so that no one creates object of it) and this implements Coffee interface. It has an attribute which is Coffee type and initiating that inside constructor with argument. Now WithMocha, WithWhipCream, WithWholeMilk classes extends this CoffeeDecorator and implements their own cost and ingredients method by keep adding with the super class method.

DecoratorPatternTestClient has main method to test this implementation.