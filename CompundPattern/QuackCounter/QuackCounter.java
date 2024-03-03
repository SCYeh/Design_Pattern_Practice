package CompundPattern.QuackCounter;

import CompundPattern.Duck.Quackable;
import CompundPattern.DuckObserver.Observer.DuckObserver;

public class QuackCounter implements Quackable {
    public static int quackCounter = 0;
    private Quackable quackable;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    public void quack() {
        quackable.quack();
        quackCounter += 1;
    }

    public static int getQuackCounter() {
        return quackCounter;
    }

    public void registerObserver(DuckObserver duckObserver) {
        quackable.registerObserver(duckObserver);  //當QuackCounter收到Observer時，將這個Observer傳給底下的leaf進行註冊
    }

    public void notifyObserver() {}
}
