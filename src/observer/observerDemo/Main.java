package observer.observerDemo;

import observer.observerDemo.impl.Type1Observer;
import observer.observerDemo.impl.Type2Observer;

public class Main {
    public static void main(String[] args) {

        // Creating Observer Objects
        Observer observer1 = new Type1Observer();
        Observer observer2 = new Type2Observer();
        Observer observer3 = new Type2Observer();

        // Creating an instance of the Subject
        Subject subject = new Subject();

        // Subscribing the Observers
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);

        // Only the subscribed observers will get notified (1,2,3)
        subject.notifyAllObservers("Event 1");

        // Unsubscribing an Observer
        subject.removeObserver(observer3);

        // Only the subscribed observers will get notified (1,2)
        subject.notifyAllObservers("Event 2");
    }
}