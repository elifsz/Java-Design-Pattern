
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author elif
 */
public class Menu {

    //Transactions made are kept in the stack for undo operation.
    Stack<MenuItem> items = new Stack<>();

    private String text;

    //Menu operations are added to the 
    //stack and clicked, that is, execute, is applied.
    public void addMenuItem(MenuItem m) {
        items.push(m);
        text = m.clicked();
    }

    public String getText() {
        return text;
    }

    public String undoMenuItem() {
        MenuItem undo = items.pop();
        return undo.clickedUndo() + " " + undo.getCommandName();
    }

}
