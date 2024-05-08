import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProjectTest {
    @Test
    public void testTurnOnLight() {
        Light light = new Light();
        Command turnOnLight = new TurnOnLightCommand(light);
        RemoteControl remoteControl = new RemoteControl();
      
        remoteControl.setCommand(turnOnLight);
        remoteControl.pressButton();
        assertEquals(true, light.isOn);
    }

    @Test
    public void testUndo() {
        Light light = new Light();
        Command turnOnLight = new TurnOnLightCommand(light);
        Command turnOffLight = new TurnOffLightCommand(light);
        RemoteControl remoteControl = new RemoteControl();
      
        remoteControl.setCommand(turnOnLight);
        remoteControl.pressButton();
        remoteControl.undo();
        assertEquals(false, light.isOn);
      
        remoteControl.setCommand(turnOffLight);
        remoteControl.pressButton();
        remoteControl.undo();
        assertEquals(true, light.isOn);
    }
}