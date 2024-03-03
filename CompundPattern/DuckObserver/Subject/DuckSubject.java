package CompundPattern.DuckObserver.Subject;

import CompundPattern.DuckObserver.Observer.DuckObserver;

public interface DuckSubject {
    public void registerObserver(DuckObserver duckObserver);
    public void notifyObserver();
}
