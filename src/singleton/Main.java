package singleton;

public class Main {
    public static void main(String[] args) {

        // Creating a object of clipboard

        Clipboard clipboard1 = Clipboard.getInstance();
        Clipboard clipboard2 = Clipboard.getInstance();
        Clipboard clipboard3 = Clipboard.getInstance();

        clipboard1.copy("Hello Clipboard1");
        clipboard2.copy("Hello Clipboard2");
        clipboard3.copy("Hello Clipboard3");

        System.out.println(clipboard1.paste());
        System.out.println(clipboard2.paste());
        System.out.println(clipboard3.paste());

        // We can clearly see that clipboard1 , clipboard2 and clipboard 3 represents the same instance of Clipboard class.

    }
}