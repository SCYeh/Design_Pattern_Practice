package Facade.HomeTheater;

public class Player {
    public void on() {
        System.out.println("Player on!");
    }

    public void play(String movie) {
        System.out.println(String.format("Player play %s", movie));
    }

    public void stop() {
        System.out.println("Player stop!");
    }

    public void off() {
        System.out.println("Player off!");
    }
}
