public class TV implements Device {
    public void turnOn() {
        System.out.println("TV turns on with a bright flash.");
    }

    public void turnOff() {
        System.out.println("TV powers down to standby.");
    }

    public void setVolume(int level) {
        System.out.println("TV volume set to: " + level + "%");
    }
}
