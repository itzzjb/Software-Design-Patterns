package observer.observerReal.impl;

import observer.observerReal.MatchEvent;
import observer.observerReal.Observer;

public class WinPredictorObserver implements Observer {
    @Override
    public void notifyMe(MatchEvent event) {
        // todo: calculate the win percentage based on the new data.
        System.out.println("Updating the win predictor.");
    }
}
