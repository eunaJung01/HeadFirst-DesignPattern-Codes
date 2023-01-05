package Chapter_6.undo.commands;

public interface Command {

    public void execute();

    public void undo();

}

