package CompundPattern.Duck;

import java.util.ArrayList;
import java.util.List;

import CompundPattern.DuckObserver.Observer.DuckObserver;

public class DuckFlock implements Quackable {
    private List<Quackable> duckFlock;

    public DuckFlock() {
        duckFlock = new ArrayList<>();
    }

    public void addDuck(Quackable quackable) {
        duckFlock.add(quackable);
    }

    public void quack() {
        for (Quackable quackable : duckFlock) {
            quackable.quack(); //DuckFlock不需要notifyObserver，當DuckFlock quack時，交由內部的quackable quack並且notify Observer
        }
    }

    public void registerObserver(DuckObserver duckObserver) {
        for (Quackable quackable : duckFlock) {
            quackable.registerObserver(duckObserver); //當DuckFlock收到Observer時，將這個Observer傳給底下的leaf進行註冊
        }
    }

    public void notifyObserver() {}
}
