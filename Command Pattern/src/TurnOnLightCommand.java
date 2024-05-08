public class TurnOnLightCommand implements Command {
    private final Light light;

    TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo(){
        light.off();
    }
}