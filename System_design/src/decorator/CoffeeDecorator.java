package decorator;

// CoffeeDecorator.java
public abstract class CoffeeDecorator implements Coffee {
     Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public int getCost() {
        return decoratedCoffee.getCost();
    }
}