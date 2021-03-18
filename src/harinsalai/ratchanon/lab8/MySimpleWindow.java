package harinsalai.ratchanon.lab8;

import javax.swing.*;
import java.awt.*;

public class MySimpleWindow extends JFrame {
    protected JFrame frame;
    protected JPanel panel;
    protected JButton resetButton, submitButton;

    protected MySimpleWindow(String name) {
        setTitle(name);
    }

    //create methode for check
    protected void setComponents() {
        //create frame
        frame = new JFrame();
        frame.setLayout(new BorderLayout());

        //create panel
        panel = new JPanel();

        //create button
        resetButton = new JButton("Reset");
        submitButton = new JButton("Submit");
    }
    protected void addComponents() {
        setComponents();

        //add button to panel
        panel.add(resetButton);
        panel.add(submitButton);

        //add panel to frame
        add(panel, BorderLayout.SOUTH);
    }

    protected void setFrameFeatures() {
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack(); //use for show every component while didn't set size
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
}
