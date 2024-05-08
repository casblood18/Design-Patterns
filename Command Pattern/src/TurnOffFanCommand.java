public class TurnOffFanCommand implements Command {
    private final Fan fan;

    TurnOffFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.off();
    }

    @Override
    public void undo(){
        fan.on();
    }
}
