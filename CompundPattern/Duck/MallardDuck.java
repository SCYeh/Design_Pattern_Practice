package CompundPattern.Duck;

import CompundPattern.DuckObserver.Observer.DuckObserver;
import CompundPattern.DuckObserver.Subject.*;

public class MallardDuck implements Quackable {
    private DuckSubject duckSubject;

    public MallardDuck() {
        duckSubject = new SubjectBehavior(this);
    }
    
    public void quack() {
        System.out.println("Quack!");
        notifyObserver();
    }

    public void registerObserver(DuckObserver duckObserver) {
        duckSubject.registerObserver(duckObserver);
    }

    public void notifyObserver() {
        duckSubject.notifyObserver();
    }
}
