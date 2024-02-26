package Facade;

import Facade.HomeTheater.*;

public class HomeTheaterFacade {
    public Popper popper;
    public Light light;
    public Screen screen;
    public Projector projector;
    public Amp amp;
    public Player player;

    public HomeTheaterFacade(Popper popper, Light light, Screen screen, Projector projector, Amp amp, Player player) {
        this.popper = popper;
        this.light = light;
        this.screen = screen;
        this.projector = projector;
        this.amp = amp;
        this.player = player;
    }

    public void watchMovie(String moive) {
        popper.on();
        popper.pop();
        light.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setVolume(5);
        player.on();
        player.play(moive);
    }

    public void endMovie() {
        popper.off();
        light.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }
}
