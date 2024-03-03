package CompundPattern.DuckFactory;

import CompundPattern.Duck.*;
import CompundPattern.QuackCounter.QuackCounter;

public class DuckCountQuackFactory implements AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck()); //Decorator: 只有被包起來的Quackable quack的時候才會計數
    }

    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
