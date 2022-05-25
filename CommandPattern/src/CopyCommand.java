/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elif
 */
public class CopyCommand implements ICommand {

    private Document document;

    public CopyCommand(Document document) {
        this.document = document;
    }

    @Override
    public String execute() {
        return document.copy();
    }

    @Override
    public String undo() {
        return document.undo();
    }

}
