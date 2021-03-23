package harinsalai.ratchanon.lab8;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV2 extends PlayerFormV1 {
    protected String[] playerType = {"Beginner", "Amateur", "Professional"};
    protected JPanel playerTypePanel, notePanel, subPanel3;
    protected JComboBox playerTypeComboBox;
    protected JTextArea noteTextArea;
    protected JLabel playerTypeLabel, noteLabel;
    protected JScrollPane noteScrollPane;

    protected PlayerFormV2(String name) {
        super(name);
    }

    protected void setComponents() {
        super.setComponents();
        //set main panel
        playerPanel.setLayout(new BorderLayout());

        //create sub panel
        playerTypePanel = new JPanel(new GridLayout(1, 2));
        notePanel = new JPanel(new BorderLayout());
        subPanel3 = new JPanel(new BorderLayout());

        //create combo box
        playerTypeComboBox = new JComboBox(playerType);
        playerTypeComboBox.setSelectedItem("Amateur");

        //create label
        playerTypeLabel = new JLabel("Player Type:");
        noteLabel = new JLabel("Note:");

        //create text area
        String noteText = "A game is a structured form of play, usually undertaken for entertainment or fun, and sometimes used as an educational tool.";
        noteTextArea = new JTextArea(noteText,3,35);
        noteTextArea.setLineWrap(true); //make line to fit with current size of area
        noteScrollPane = new JScrollPane(noteTextArea); //create scroll pane for setting text area
    }

    protected void addComponents() {
        super.addComponents();

        //add all of things to sub panel
        playerTypePanel.add(playerTypeLabel, BorderLayout.WEST);
        playerTypePanel.add(playerTypeComboBox, BorderLayout.EAST);
        notePanel.add(noteLabel, BorderLayout.NORTH);
        notePanel.add(noteScrollPane, BorderLayout.CENTER);
        subPanel3.add(playerTypePanel, BorderLayout.CENTER);
        subPanel3.add(notePanel, BorderLayout.PAGE_END);

        //add sub panel to main panel
        playerPanel.add(subPanel3, BorderLayout.PAGE_END);
    }

    public static void createAndShowGUI() {
        PlayerFormV2 msw = new PlayerFormV2("Player Form V2");
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
