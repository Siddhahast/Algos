package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by siddhahastmohapatra on 25/01/17.
 */
public class WeatherStation implements ISubject{

    private int temp;
    private int pressure;
    private int humidity;

    List<Observer> observers ;

    public WeatherStation(){
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void notifyObeservers() {
        for(Observer ob: observers){
            ob.update(temp, pressure, humidity);
        }
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.get(observers.indexOf(o));
    }

    public void setTemp(int temp){
        this.temp = temp;
        notifyObeservers();
    }

    public void setPressure(int pressure){
        this.pressure = pressure;
        notifyObeservers();
    }

    public void setHumidity(int humidity){
        this.humidity = humidity;
        notifyObeservers();
    }

}
