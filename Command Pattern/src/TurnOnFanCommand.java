public class TurnOnFanCommand implements Command {
    private final Fan fan;

    TurnOnFanCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }

    @Override
    public void undo(){
        fan.off();
    }
}