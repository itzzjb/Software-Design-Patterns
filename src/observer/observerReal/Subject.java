package observer.observerReal;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    // Creating an array list of Observers
    // We need to make this property private so the list can't be direct accessed.
    private  List<Observer> observerList = new ArrayList<>();

    // Whatever the Observer coming as a parameter here will be added to the Array
    // Subscribing ...
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    // Whatever the Observer coming as a parameter here will be removed from the Array
    // Unsubscribing...
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    // Go throughout the list and notify all the observers on the event
    public void notifyAllObservers(MatchEvent event) {
        for (Observer observer: observerList) {
            observer.notifyMe(event);
        }
    }

    // Actions we can take based on a delivery (event) :
    // There are different programs listening to this event
    // So these classes are Observers
    // 1. Update the Win predictor -> WinPredictorObserver class
    // 2. Update the Batting card -> BattingCardObserver class
    // 3. Update the Bowling card -> BowlingCardObserver class
    // 4. Update the Records ( Doesn't happen for every delivery. On special locations only. ) -> RecordsObserver class
    // etc.

}
