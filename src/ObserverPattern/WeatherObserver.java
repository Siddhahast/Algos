package ObserverPattern;

/**
 * Created by siddhahastmohapatra on 25/01/17.
 */
public class WeatherObserver implements Observer, DataPresenter {

    private ISubject subject;
    private int temp;
    private int humidity;
    private int pressure;

    public WeatherObserver(ISubject subject){
        this.subject = subject;
    }

    @Override
    public void update(int temp, int pressure, int humidity) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        presentWeatherData();
    }

    @Override
    public void presentWeatherData() {
        System.out.println(temp + " - "+ humidity+ " - "+ pressure);
    }
}
