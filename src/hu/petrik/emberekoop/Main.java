package hu.petrik.emberekoop;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Ember human = new Ember("Gipsz Jakab", "2001-1-1", "Budapest");
        Ember human2 = new Ember("Teszt Elek", "1985-12-15", "Debrecen");
        Ember human3 = new Ember("Kovács István", "1999-3-30", "Szeged");
        Ember human4 = new Ember("Sárosi Roland", "1973-1-1", "Budapest");
        Ember human5 = new Ember("Róth Nikolett", "1973-2-26", "Veszprém");
        Emberek emberek = new Emberek(new Ember[]{human,human2,human3,human4,human5});
        out.println(emberek);
    }
}
