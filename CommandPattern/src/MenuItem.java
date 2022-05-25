/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elif
 */
public class MenuItem {

    //Execute or undo operation is done according to MenuItem commands
    private ICommand command;

    public MenuItem(ICommand command) {
        this.command = command;
    }

    public String clicked() {
        return command.execute();
    }

    public String clickedUndo() {
        return command.undo();
    }

    public String getCommandName() {
        return command.getClass().getName();
    }
}
