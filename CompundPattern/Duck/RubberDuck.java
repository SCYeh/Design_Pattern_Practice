package CompundPattern.Duck;

import CompundPattern.DuckObserver.Observer.DuckObserver;
import CompundPattern.DuckObserver.Subject.*;

public class RubberDuck implements Quackable {
    private DuckSubject duckSubject;

    public RubberDuck() {
        duckSubject = new SubjectBehavior(this);
    }
    
    public void quack() {
        System.out.println("Squeak!");
        notifyObserver();
    }

    public void registerObserver(DuckObserver duckObserver) {
        duckSubject.registerObserver(duckObserver);
    }

    public void notifyObserver() {
        duckSubject.notifyObserver();
    }
}
