import java.util.Stack;

public class RemoteControl {
    Stack<Command> history = new Stack<>();
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        history.push(command);
        this.command.execute();
    }

    public void undo(){
        if(!history.isEmpty()){
            Command undoCommand = history.pop();
            undoCommand.undo();
        }
    }
}