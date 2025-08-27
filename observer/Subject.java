package observer;
/**
 * Subject class that used to manage the oberservers to be notified by the Subjects
 * @author Jacob Webster
 */
import java.util.ArrayList;

public abstract class Subject {
    protected ArrayList<Observer> observers = new ArrayList<>();

    public Subject() {

    }
    /**
     * registerObserver allows for an observer to be added to the arrayList
     * @param observer passes in the specific observer to be added
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    /**
     * remove Observer allows for an oberserver to be removed from the arrayList
     * @param observer passes in the specific observer to be removed
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    /**
     * abstract method used to initiate updates to observers
     * @param note note manages what the Subjects see
     */
    public abstract void issueNotice(int note);
    /**
     * abstract method used to notify the observers of what the Subjects have seen
     * @param note note manages what to send observers
     */
    public abstract void notifyObservers(int note);

}
