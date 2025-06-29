package decorator;

public class SugarCoffee extends CoffeeDecorator{

    public SugarCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Sugar";
    }

    @Override
    public int getCost() {
        return super.getCost() + 5;
    }
}
