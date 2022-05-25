
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author elif
 */
public class Document {
   
    //In order to edit the text area from the GUI, the document's own text area is defined.
    private JTextArea documentTextArea;
    private String data;
    private UndoManager manager;
    private String name;

    public String getData() {
        return this.data;
    }

    public String getName() {
        return this.name;
    }

    public void setDocumentTextArea(JTextArea a) {
        this.documentTextArea = a;
        this.manager = new UndoManager();
        documentTextArea.getDocument().addUndoableEditListener((UndoableEditEvent e) -> {
            manager.addEdit(e.getEdit());
        });
    }

    public JTextArea getDocumentTextArea() {
        return documentTextArea;
    }

    public Document(String name) {
        this.data = "";
        this.name = name;
    }

    //The execute and undo operations of commands are defined.
    public String open() {
        try {
            File file = new File(name);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                this.data += scanner.nextLine() + "\n";
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }

        return "Document Open ";
    }

    public String close() {
        this.data = "";
        documentTextArea.setText(data);
        return "Document Close ";
    }

    public String cut() {
        documentTextArea.cut();
        return "Document Cut ";
    }

    public String copy() {
        documentTextArea.copy();
        return "Document Copy ";
    }

    public String paste() {
        documentTextArea.paste();
        return "Document Paste ";
    }

    public String undo() {
        if (manager.canUndo()) {
            manager.undo();
        }
        return "Undo ";
    }
}
