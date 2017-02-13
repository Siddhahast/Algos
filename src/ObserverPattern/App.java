package ObserverPattern;

/**
 * Created by siddhahastmohapatra on 25/01/17.
 */
public class App {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        Observer ob = new WeatherObserver(station);
        station.addObserver(ob);
        station.setHumidity(100);
        station.setTemp(30);
        station.setPressure(100);

    }

}
