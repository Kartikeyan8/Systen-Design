package Observer;

public class ObserverImpl implements ObserverInterface{
    String weather;
    @Override
    public void update(String weather) {
        this.weather = weather;
        displayMethod();
    }
    void displayMethod()
    {
        System.out.println("Display is implemented");
    }
}
