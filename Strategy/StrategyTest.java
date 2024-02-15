package Strategy;

import Strategy.Duck.*;
import Strategy.Flyable.FlyRocketPowered;

import java.util.ArrayList;
import java.util.List;

public class StrategyTest {
    public static void main(String[] argv) {
        List<Duck> duckList = new ArrayList<>();
        duckList.add(new MallardDuck());
        duckList.add(new DecoyDuck());
        duckList.add(new RubberDuck());
        duckList.add(new ModelDuck());

        // 執行期才將Fly行為動態修改為FlyRocketPowered
        duckList.get(duckList.size()-1).setFlyBehavior(new FlyRocketPowered());

        for (Duck duck : duckList) {
            duck.swim();
            duck.fly();
            duck.quack();
            duck.display();
            System.out.println("");
        }
    }
}
