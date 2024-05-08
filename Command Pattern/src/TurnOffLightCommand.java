public class TurnOffLightCommand implements Command {
    private final Light light;

    TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo(){
        light.on();
    }
}