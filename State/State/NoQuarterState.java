package State.State;

import State.GumballMachine;

public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Inserting quarter!");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("Gumball Machine has no quarter!");
    }

    public void turnCrank() {
        System.out.println("Please insert quarter first!");
    }

    public void dispense() {}

    
    public void replenish() {
        System.out.println("Gumball haven't sold out!");
    }
}
