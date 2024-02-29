package State.State;

import State.GumballMachine;

public class SoldState implements State {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait for the gumball!");
    }

    public void ejectQuarter() {
        System.out.println("Please wait for the gumball!");
    }

    public void turnCrank() {}

    public void dispense() {
        System.out.println("Dispensing gumballs!");
        gumballMachine.releaseGumball();

        if (gumballMachine.getGumballCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    public void replenish() {}
}
