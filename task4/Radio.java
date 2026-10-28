public class Radio implements Device {
    public void turnOn() {
        System.out.println("Radio starts playing static/music.");
    }

    public void turnOff() {
        System.out.println("Radio goes silent.");
    }

    public void setVolume(int level) {
        System.out.println("Radio volume knob turned to: " + level);
    }
}
