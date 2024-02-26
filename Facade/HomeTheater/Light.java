package Facade.HomeTheater;

public class Light {
    public void on() {
        System.out.println("Light on!");
    }

    public void dim(int light) {
        System.out.println(String.format("Light %d!", light));
    }
}
