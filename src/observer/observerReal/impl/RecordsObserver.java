package observer.observerReal.impl;

import observer.observerReal.Main;
import observer.observerReal.MatchEvent;
import observer.observerReal.Observer;

public class RecordsObserver implements Observer {
    @Override
    public void notifyMe(MatchEvent event) {
        // todo: Check whether any new record has been broken. if so add them to database
        System.out.println("Updating the records observer.");
    }
}
