package harinsalai.ratchanon.lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;

public class PlayerFormV8 extends PlayerFormV7 {
    protected JFileChooser menuFileChooser;
    protected int menuSelection;
    protected Font lebelFont, textAreaFont;
    public PlayerFormV8(String name) {
        super(name);
    }

    protected void addComponents() {
        super.addComponents();
        openMenuItem.setMnemonic(KeyEvent.VK_O);
        saveMenuItem.setMnemonic(KeyEvent.VK_S);
        exitMenuItem.setMnemonic(KeyEvent.VK_Q);

        openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
    }

    protected void addListeners() {
        super.addListeners();
        openMenuItem.addActionListener(this::actionPerformed);
        saveMenuItem.addActionListener(this::actionPerformed);
        exitMenuItem.addActionListener(this::exitPerformed);
        redMenuItem.addActionListener(this::itemPerformed);
        greenMenuItem.addActionListener(this::itemPerformed);
        blueMenuItem.addActionListener(this::itemPerformed);
        size16MenuItem.addActionListener(this::itemPerformed);
        size20MenuItem.addActionListener(this::itemPerformed);
        size24MenuItem.addActionListener(this::itemPerformed);
    }

    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object src = e.getSource();
        menuFileChooser = new JFileChooser();
        menuFileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        if (menuSelection == menuFileChooser.showOpenDialog(openMenuItem)) {
            File selectedFile = menuFileChooser.getSelectedFile();
            String nameFile = menuFileChooser.getName(selectedFile);
            if (menuSelection == JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(this, "Open file " + nameFile,
                        "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
            }

            else if ( menuSelection == JFileChooser.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(this, "Open command cancelled by user",
                        "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
            }
        }

        else if (menuSelection == menuFileChooser.showSaveDialog(saveMenuItem)) {
            File selectedFile = menuFileChooser.getSelectedFile();
            String nameFile = menuFileChooser.getName(selectedFile);
            if (menuSelection == JFileChooser.APPROVE_OPTION) {
                JOptionPane.showMessageDialog(this, "Save file " + nameFile,
                        "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
            }

            else if ( menuSelection == JFileChooser.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(this, "Save command cancelled by user",
                        "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
            }
        }
    }

    public void exitPerformed(ActionEvent e) {
        Object src = e.getSource();
        menuFileChooser = new JFileChooser();
        System.exit(0);
    }

    protected void colorChange(Color c) {
        nameTextField.setForeground(c);
        nationalityTextField.setForeground(c);
        dateofbirthTextField.setForeground(c);
    }

    protected void sizeChange(int size) {
        lebelFont = new Font("Serif", Font.PLAIN, size);
        textAreaFont = new Font("Serif", Font.BOLD, size);
        noteTextArea.setFont(textAreaFont);
    }

    public void itemPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == redMenuItem) {
            colorChange(Color.RED);
        }

        else if (src == blueMenuItem) {
            colorChange(Color.BLUE);
        }

        else if (src == greenMenuItem) {
            colorChange(Color.GREEN);
        }

        else if (src == size16MenuItem) {
            sizeChange(16);
        }

        else if (src == size20MenuItem) {
            sizeChange(20);
        }

        else if (src == size24MenuItem) {
            sizeChange(24);
        }
    }

    public static void createAndShowGUI() {
        PlayerFormV8 msw = new PlayerFormV8("Player Form V8");
        msw.addComponents();
        msw.addListeners();
        msw.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
