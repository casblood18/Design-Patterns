public class Light {
    boolean isOn;

    public void on() {
        this.isOn = true;
        System.out.println("Light is on");
    }

    public void off() {
        this.isOn = false;
        System.out.println("Light is off");
    }
}