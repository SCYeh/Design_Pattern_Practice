package Command.Command;

import Command.Receiver.Stereo;

public class StereoOffCommand implements Command {
    private Stereo stereo;
    private int prevVolume;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        prevVolume = stereo.getVolume();
        stereo.setVolumeOFF();
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
        }
    }
}
