package Strategy.Quackable;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("MuteQuack!");
    }
}
