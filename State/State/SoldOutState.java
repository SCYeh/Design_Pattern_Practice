package State.State;

import State.GumballMachine;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Gumball sold out!");
    }

    public void ejectQuarter() {
        System.out.println("Gumball Machine has no quarter!");
    }

    public void turnCrank() {
        System.out.println("Gumball sold out!");
    }

    public void dispense() {}
}
