package harinsalai.ratchanon.lab8;

import javax.swing.*;
import java.awt.*;

public class MySimpleWindow extends JFrame {
    protected JPanel mainPanel, buttonPanel;
    protected JButton resetButton, submitButton;

    protected MySimpleWindow(String name) {
        setTitle(name);
    }

    //create methode for check
    protected void setComponents() {
        setLayout(new BorderLayout());

        //create panel
        mainPanel = new JPanel();
        buttonPanel = new JPanel();

        //create button
        resetButton = new JButton("Reset");
        submitButton = new JButton("Submit");
    }

    protected void addComponents() {
        setComponents();

        //add button to panel
        buttonPanel.add(resetButton);
        buttonPanel.add(submitButton);

        //add sub panel to main panel
        mainPanel.add(buttonPanel);

        //add panel to frame
        add(mainPanel, BorderLayout.SOUTH);
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
