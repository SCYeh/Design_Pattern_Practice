package State;

public class StateTest {
    public static void main(String[] argv) {
        GumballMachine gumballMachine = new GumballMachine(2);

        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();
        gumballMachine.replenish();
        gumballMachine.insertQuarter();

        gumballMachine.insertQuarter();
        gumballMachine.replenish();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("Next round!\n");

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println("Next round!\n");

        gumballMachine.insertQuarter();
        gumballMachine.replenish();
        System.out.println(String.format("Number of gumballs: %d", gumballMachine.getGumballCount()));
    }
}
