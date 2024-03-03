package CompundPattern.Duck;

import CompundPattern.DuckObserver.Observer.DuckObserver;
import CompundPattern.DuckObserver.Subject.*;

public class DuckCall implements Quackable {
    private DuckSubject duckSubject;

    public DuckCall() {
        duckSubject = new SubjectBehavior(this);
    }

    public void quack() {
        System.out.println("Kwak!");
        notifyObserver();
    }

    public void registerObserver(DuckObserver duckObserver) {
        duckSubject.registerObserver(duckObserver);
    }

    public void notifyObserver() {
        duckSubject.notifyObserver();
    }
}
