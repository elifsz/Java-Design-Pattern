
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author elif
 */
public class MacroCommand implements ICommand {

    private ICommand[] commands;
    private String commandWord;

    MacroCommand(ICommand[] commands) {
        this.commands = commands;
    }

    @Override
    public String execute() {
        commandWord = "";
        for (int i = 0; i < commands.length; i++) {
            commandWord += commands[i].execute() + "  ";
        }
        return commandWord;
    }

    @Override
    public String undo() {
        commandWord = "";
        for (int i = 0; i < commands.length; i++) {
            commandWord = commands[i].undo();
        }
        return commandWord;
    }

    public String getCommandWord() {
        return commandWord;
    }

}
