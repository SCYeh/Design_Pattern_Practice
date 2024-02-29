package State;

import State.State.*;

public class GumballMachine {
    private State hasQuarterState;
    private State noQuarterState;
    private State soldOutState;
    private State soldState;

    private State state;
    private int gumballCount;

    public GumballMachine(int gumballCount) {
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);

        this.gumballCount = gumballCount;
        if (gumballCount > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getGumballCount() {
        return gumballCount;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void replenish() {
        state.replenish();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setGumballCount(int gumballCount) {
        this.gumballCount = gumballCount;
    }

    public void releaseGumball() {
        System.out.println("Release Gumballs!");
        gumballCount -= 1;
    }
}
