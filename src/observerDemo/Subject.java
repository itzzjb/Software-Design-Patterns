package observerDemo;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    // Creating an array list of Observers
    // We need to make this property private so the list can't be direct accessed.
    private  List<Observer> observerList = new ArrayList<>();

    // Whatever the Observer coming as a parameter here will be added to the Array
    // Subscribing ...
    public void register(Observer observer) {
        observerList.add(observer);
    }

    // Whatever the Observer coming as a parameter here will be removed from the Array
    // Unsubscribing...
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    // Go throughout the list and notify all the observers on the event
    public void notifyAllObservers(String event) {
        for (Observer observer: observerList) {
            observer.notifyMe(event);
        }
    }

}
