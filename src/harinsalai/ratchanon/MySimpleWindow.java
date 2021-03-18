package harinsalai.ratchanon;

import javax.swing.*;
import java.awt.*;


public class MySimpleWindow extends JFrame {
    protected JPanel  panel;
    protected JButton submitButton, resetButton;

    public MySimpleWindow(String title) {//create 1st    panel
        super(title);
        panel = new JPanel();
        setLayout(new BorderLayout());
    }

    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    protected void addComponents() {
        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");
        panel.add(resetButton);
        panel.add(submitButton);
        add(panel, BorderLayout.PAGE_END);
    }

    protected void setFrameFeatures() {
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

}
