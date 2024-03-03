package CompundPattern.DuckObserver.Observer;

import CompundPattern.Duck.Quackable;

public interface DuckObserver {
    public void update(Quackable quackable);
}
