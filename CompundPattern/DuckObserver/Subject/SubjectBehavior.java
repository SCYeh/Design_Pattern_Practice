package CompundPattern.DuckObserver.Subject;

import java.util.ArrayList;
import java.util.List;

import CompundPattern.Duck.Quackable;
import CompundPattern.DuckObserver.Observer.DuckObserver;

public class SubjectBehavior implements DuckSubject {
    private List<DuckObserver> duckObservers;
    private Quackable quackable;

    public SubjectBehavior(Quackable quackable) {
        duckObservers = new ArrayList<>();
        this.quackable = quackable;
    }

    public void registerObserver(DuckObserver duckObserver) {
        duckObservers.add(duckObserver);
    }

    public void notifyObserver() {
        for (DuckObserver duckObserver : duckObservers) {
            duckObserver.update(quackable);
        }
    }
}
