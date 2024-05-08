public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        Command turnOnLight = new TurnOnLightCommand(light);
        Command turnOffLight = new TurnOffLightCommand(light);
        Command turnOnFan = new TurnOnFanCommand(fan);
        Command turnOffFan = new TurnOffFanCommand(fan);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(turnOnLight);
        remoteControl.pressButton();
      
        remoteControl.setCommand(turnOnFan);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffLight);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffFan);
        remoteControl.pressButton();

        System.out.println("undoing everything");
      
        remoteControl.undo();
        remoteControl.undo();
        remoteControl.undo();
        remoteControl.undo();
    }
}