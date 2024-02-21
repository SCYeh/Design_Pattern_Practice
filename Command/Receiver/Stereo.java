package Command.Receiver;

public class Stereo {
    public static final int HIGH = 12;
    public static final int MEDIUM = 6;
    public static final int LOW = 2;
    public static final int OFF = 0;
    private int volume;

    public Stereo() {
        volume = OFF;
    }

    public void setVolumeHigh() {
        volume = HIGH;
        System.out.println("Stereo set volume HIGH!");
    }

    public void setVolumeMEDIUM() {
        volume = MEDIUM;
        System.out.println("Stereo set volume MEDIUM!");
    }

    public void setVolumeLOW() {
        volume = LOW;
        System.out.println("Stereo set volume LOW!");
    }

    public void setVolumeOFF() {
        volume = OFF;
        System.out.println("Stereo set volume OFF!");
    }

    public int getVolume() {
        return volume;
    }
}
