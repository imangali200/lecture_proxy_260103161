public class BasicRemote {
    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    public void powerOn() {
        device.turnOn();
    }

    public void powerOff() {
        device.turnOff();
    }

    public void volumeUp() {
        device.setVolume(100);
    }

    public void volumeDown() {
        device.setVolume(0);
    }
}
