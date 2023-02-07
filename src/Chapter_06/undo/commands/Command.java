package Chapter_06.undo.commands;

public interface Command {

    public void execute();

    public void undo();

}

