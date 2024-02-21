package Command.Command;

import Command.Receiver.Stereo;

public class StereoSetLowCommand implements Command {
    private Stereo stereo;
    private int prevVolume;

    public StereoSetLowCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        prevVolume = stereo.getVolume();
        stereo.setVolumeLOW();
    }

    public void undo() {
        switch (prevVolume) {
            case Stereo.HIGH:
                stereo.setVolumeHigh();
                break;
            case Stereo.MEDIUM:
                stereo.setVolumeMEDIUM();
                break;
            case Stereo.OFF:
                stereo.setVolumeOFF();
                break;
        }
    }
}
