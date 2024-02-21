package Command.Command;

import Command.Receiver.Stereo;

public class StereoSetHighCommand implements Command {
    private Stereo stereo;
    private int prevVolume;

    public StereoSetHighCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        prevVolume = stereo.getVolume();
        stereo.setVolumeHigh();
    }

    public void undo() {
        switch (prevVolume) {
            case Stereo.HIGH:
                stereo.setVolumeHigh();
                break;
            case Stereo.MEDIUM:
                stereo.setVolumeMEDIUM();
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
