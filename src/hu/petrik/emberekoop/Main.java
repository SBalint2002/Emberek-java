package hu.petrik.emberekoop;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Ember human = new Ember("Gipsz Jakab", "2001-1-1", "Budapest");
        Ember human2 = new Ember("Teszt Elek", "1985-12-15", "Debrecen");
        Ember human3 = new Ember("Kovács István", "1999-3-30", "Szeged");
        out.println(human);
        out.println(human2);
        out.println(human3);
    }
}
