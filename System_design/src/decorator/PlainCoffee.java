package decorator;

public class PlainCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Getting PLain Coffee";
    }

    @Override
    public int getCost() {
    return 5;
    }
}
