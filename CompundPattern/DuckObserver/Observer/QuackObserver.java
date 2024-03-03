package CompundPattern.DuckObserver.Observer;

import CompundPattern.Duck.Quackable;

public class QuackObserver implements DuckObserver {
    public void update(Quackable quackable) {
        System.out.println(String.format("Quack observer: %s quack!", quackable));
    }
}
