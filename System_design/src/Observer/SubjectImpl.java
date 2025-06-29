package Observer;

import java.util.ArrayList;

public class SubjectImpl implements Subject{
    ArrayList<ObserverInterface> list = new ArrayList<>();
    String weather;
    @Override
    public void addObserver(ObserverInterface observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(ObserverInterface observer) {
    list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(ObserverInterface newob : list)
        {
            newob.update(weather);
        }
    }
    public void setWeather(String weather)
    {
        this.weather = weather;
        notifyObservers();
    }
}
