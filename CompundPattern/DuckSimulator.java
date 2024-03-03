package CompundPattern;

import CompundPattern.Duck.*;
import CompundPattern.Goose.*;
import CompundPattern.DuckFactory.*;
import CompundPattern.DuckObserver.Observer.DuckObserver;
import CompundPattern.DuckObserver.Observer.QuackObserver;
import CompundPattern.QuackCounter.QuackCounter;

public class DuckSimulator {
    public static void main(String[] argv) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    public void simulate() {
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory duckCountQuackFactory = new DuckCountQuackFactory();

        Quackable mallardDuck = duckFactory.createMallardDuck(); //Abstract Factory: 這個工廠會建立沒有用QuackCounter Decorator包裝起來的Duck，所以最後不會計算到這隻Duck的quack
        Quackable redheadDuck = duckCountQuackFactory.createRedheadDuck();
        Quackable duckCall = duckCountQuackFactory.createDuckCall();
        Quackable rubberDuck = duckCountQuackFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose()); //Adapter

        DuckObserver duckObserver = new QuackObserver();
        DuckFlock duckFlock_1 = new DuckFlock(); //Composite: 由於Quackable為介面，因此只有DuckFlock會有addDuck method(Quackable沒有)，所以Composite必須宣告為DuckFlock class(間接導致DuckFlock無法使用Factory建立)，但好處是其餘Quackable不會出現不能使用的addDuck method
        duckFlock_1.addDuck(mallardDuck);
        duckFlock_1.addDuck(redheadDuck);
        duckFlock_1.addDuck(duckCall);

        DuckFlock duckFlock_2 = new DuckFlock();
        duckFlock_2.addDuck(rubberDuck);
        duckFlock_2.addDuck(goose);

        duckFlock_1.addDuck(duckFlock_2);

        duckFlock_1.registerObserver(duckObserver); //Observer: 將QuackObserver註冊給duckFlock(Subject)

        System.out.println("Duck Simulator");
        System.out.println("==============");

        System.out.println("Duck Flock 1 Quack:");
        duckSimulate(duckFlock_1);

        System.out.println("\nDuck Flock 2 Quack:");
        duckSimulate(duckFlock_2);

        System.out.println("==============");
        System.out.println(String.format("Quack count: %d", QuackCounter.getQuackCounter()));
        System.out.println("==============");
    }

    public void duckSimulate(Quackable duck) {
        duck.quack();
    }
}
