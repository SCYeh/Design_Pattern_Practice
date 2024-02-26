package Facade;

import Facade.HomeTheater.*;

public class FacadeTest {
    public static void main(String[] argv) {
        Popper popper = new Popper();
        Light light = new Light();
        Screen screen = new Screen();
        Projector projector = new Projector();
        Amp amp = new Amp();
        Player player = new Player();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(popper, light, screen, projector, amp, player);
        homeTheaterFacade.watchMovie("Titanic");
        homeTheaterFacade.endMovie();
    }
}
