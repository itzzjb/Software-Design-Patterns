package observer.observerReal;

import observer.observerReal.impl.BowlingCardObserver;
import observer.observerReal.impl.RecordsObserver;
import observer.observerReal.impl.WinPredictorObserver;
import observer.observerReal.impl.BattingCardObserver;
import org.w3c.dom.events.Event;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Creating Observer Objects
        Observer winPredictor = new WinPredictorObserver();
        Observer battingCard = new BattingCardObserver();
        Observer bowlingCard = new BowlingCardObserver();
        Observer records = new RecordsObserver();

        // Creating an instance of the Subject
        Subject subject = new Subject();

        // Subscribing the Observers
        subject.registerObserver(winPredictor);
        subject.registerObserver(battingCard);
        subject.registerObserver(bowlingCard);
        subject.registerObserver(records);

        // Creating Events
        MatchEvent event1 = new MatchEvent(7,1,50,50,"Malinga");

        // It is good to pass an event as a object rather than a string
        // So we can pass many data with related to that event with it.
        subject.notifyAllObservers(event1);

        // Waiting for 2 seconds before executing next event.
        Thread.sleep(2000);

        // Adding some more events
        MatchEvent event2 = new MatchEvent(7,2,51,54,"Malinga");
        subject.notifyAllObservers(event2);
        Thread.sleep(2000);

        MatchEvent event3 = new MatchEvent(7,3,51,55,"Malinga");
        subject.notifyAllObservers(event3);
        Thread.sleep(2000);

    }
}