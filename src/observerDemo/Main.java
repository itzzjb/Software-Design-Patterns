package observerDemo;

import observerDemo.impl.Type1Observer;
import observerDemo.impl.Type2Observer;

public class Main {
    public static void main(String[] args) {

        // Creating Observer Objects
        Observer observer1 = new Type1Observer();
        Observer observer2 = new Type2Observer();
        Observer observer3 = new Type2Observer();

        // Creating a instance of the Subject
        Subject subject = new Subject();

        // Subscribing the Observers
        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);

        // Only the subscribed observers will get notified (1,2,3)
        subject.notifyAllObservers("Event 1");

        // Unsubscribing an Observer
        subject.remove(observer3);

        // Only the subscribed observers will get notified (1,2)
        subject.notifyAllObservers("Event 2");
    }
}