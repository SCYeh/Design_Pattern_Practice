package Facade.HomeTheater;

public class Amp {
    public void on() {
        System.out.println("Amp on!");
    }

    public void setVolume(int volume) {
        System.out.println(String.format("Amp set volume to %d", volume));
    }

    public void off() {
        System.out.println("Amp off!");
    }
}
