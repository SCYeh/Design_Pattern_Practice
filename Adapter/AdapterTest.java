package Adapter;

import Adapter.Duck.*;
import Adapter.Turkey.*;

public class AdapterTest {
    public static void main(String[] argv) {
        Duck mallarDuck = new MallarDuck();
        Duck turkey = new TurkeyAdapter(new WildTurkey());

        testDuck(mallarDuck);
        testDuck(turkey);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}