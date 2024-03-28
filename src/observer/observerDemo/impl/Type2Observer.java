package observer.observerDemo.impl;

import observer.observerDemo.Observer;

public class Type2Observer implements Observer {
    @Override
    public void notifyMe(String event) {
        System.out.println("Type 2 Observer received the event: " + event);
    }
}
