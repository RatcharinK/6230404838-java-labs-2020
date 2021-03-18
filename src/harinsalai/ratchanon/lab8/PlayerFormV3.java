package harinsalai.ratchanon.lab8;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV3 extends PlayerFormV2{
    protected String[] gamesNameList = {"Guess Number Game", "High-Low Game", "Monopoly Game"};
    protected JList gamesList;
    protected JPanel gamesPanel;
    protected JLabel gamesLabel;

    protected PlayerFormV3(String name) {
        super(name);
    }

    protected void setComponents() {
        super.setComponents();
        //set main panel
        playerPanel.setLayout(new GridLayout(7,1));

        //create sub panel
        gamesPanel = new JPanel(new BorderLayout());

        //create label
        gamesLabel = new JLabel("Games:");

        //create list
        gamesList = new JList(gamesNameList);
        gamesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        gamesList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        gamesList.setVisibleRowCount(-1);
    }

    protected void addComponents() {
        super.addComponents();

        //remove for insert new panel above it
        playerPanel.remove(notePanel);

        //add label and list to sub panel
        gamesPanel.add(gamesLabel, BorderLayout.CENTER);
        gamesPanel.add(gamesList, BorderLayout.EAST);

        //add sub panel to main panel
        playerPanel.add(gamesPanel);
        playerPanel.add(notePanel);

    }

    public static void createAndShowGUI() {
        PlayerFormV3 msw = new PlayerFormV3("Player Form V3");
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
