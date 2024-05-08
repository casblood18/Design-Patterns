public class Fan {
    boolean isOn;
  
    public void on() {
        this.isOn = true;
        System.out.println("Fan is spinning");
    }

    public void off() {
        this.isOn = false;
        System.out.println("Fan is stopped");
    }
}