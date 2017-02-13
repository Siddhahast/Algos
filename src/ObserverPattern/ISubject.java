package ObserverPattern;

/**
 * Created by siddhahastmohapatra on 25/01/17.
 */
public interface ISubject {

    public void notifyObeservers();

    public void addObserver(Observer o);

    public void removeObserver(Observer o);


}
