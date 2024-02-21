package Command.Command;

import Command.Receiver.Stereo;

public class StereoSetMediumCommand implements Command {
    private Stereo stereo;
    private int prevVolume;

    public StereoSetMediumCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        prevVolume = stereo.getVolume();
        stereo.setVolumeMEDIUM();
    }

    public void undo() {
        switch (prevVolume) {
            case Stereo.HIGH:
                stereo.setVolumeHigh();
                break;
            case Stereo.LOW:
                stereo.setVolumeLOW();
                break;
            case Stereo.OFF:
                stereo.setVolumeOFF();
                break;
        }
    }
}