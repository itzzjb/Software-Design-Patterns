package observer.observerReal.impl;

import observer.observerReal.MatchEvent;
import observer.observerReal.Observer;

public class BowlingCardObserver implements Observer {
    @Override
    public void notifyMe(MatchEvent event) {
        System.out.println("Updating the batting card. Bowler name: " + event.getBowlerName());
    }
}
