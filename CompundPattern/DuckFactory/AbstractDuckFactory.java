package CompundPattern.DuckFactory;

import CompundPattern.Duck.Quackable;

public interface AbstractDuckFactory {
    public Quackable createMallardDuck();
    public Quackable createRedheadDuck();
    public Quackable createDuckCall();
    public Quackable createRubberDuck();
}
