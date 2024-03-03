package CompundPattern.Goose;

import CompundPattern.Duck.Quackable;
import CompundPattern.DuckObserver.Observer.DuckObserver;

public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    public void quack() {
        goose.honk();
    }

    public void registerObserver(DuckObserver duckObserver) {}

    public void notifyObserver() {}
}
