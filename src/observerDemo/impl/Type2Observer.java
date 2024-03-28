package observerDemo.impl;

import observerDemo.Observer;

public class Type2Observer implements Observer {
    @Override
    public void notifyMe(String event) {
        System.out.println("Type 2 Observer received the event: " + event);
    }
}
