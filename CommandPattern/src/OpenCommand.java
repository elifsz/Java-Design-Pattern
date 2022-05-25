
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author elif
 */
public class OpenCommand implements ICommand {

    private Document document;

    public OpenCommand(Document document) {
        this.document = document;
    }

    public String askUser() {
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt", "text");
        j.setFileFilter(filter);
        int r = j.showOpenDialog(null);
        if (j.getSelectedFile() == null) {
            return "default.txt";
        } else {
            File fi = new File(j.getSelectedFile().getAbsolutePath());
            return fi.getAbsolutePath();
        }
    }

    @Override
    public String execute() {
        document = new Document(askUser());
        Application.addDocument(document);
        return document.open();
    }

    @Override
    public String undo() {
        return document.undo();
    }

}
