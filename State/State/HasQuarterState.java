package State.State;

import State.GumballMachine;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You've already insert quarter!");
    }

    public void ejectQuarter() {
        System.out.println("Ejecting quarter!");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("Turning crank!");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {}
}
