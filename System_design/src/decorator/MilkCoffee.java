package decorator;

public class MilkCoffee extends CoffeeDecorator{
    public MilkCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public int getCost() {
        return decoratedCoffee.getCost() + 5;
    }
}
