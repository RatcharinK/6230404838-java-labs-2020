package harinsalai.ratchanon.lab8;

import javax.swing.*;
import java.awt.*;

public class PlayerFormV1 extends MySimpleWindow {
    protected JPanel playerPanel, subPanel1, subPanel2, radioPanel, namePanel, nationalityPanel, dateofbirthPanel, genderPanel;
    protected JLabel nameLabel, nationalityLabel, dateofbirthLabel, genderLabel;
    protected JTextField nameTextField, nationalityTextField, dateofbirthTextField;
    protected JRadioButton maleRadio, femaleRadio;
    protected ButtonGroup radioButtonGroup;

    protected PlayerFormV1(String name) {
        super(name);
    }

    protected void setComponents() {
        super.setComponents();

        //crate main panel
        playerPanel = new JPanel(new BorderLayout());
        playerPanel.setLayout(new BorderLayout());

        //create sub panel
        subPanel1 = new JPanel(new BorderLayout());
        subPanel2 = new JPanel(new BorderLayout());
        namePanel = new JPanel(new GridLayout());
        nationalityPanel = new JPanel(new GridLayout());
        dateofbirthPanel = new JPanel(new GridLayout());
        genderPanel = new JPanel(new GridLayout());
        radioPanel = new JPanel();

        //create radio button
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        femaleRadio.setSelected(true);

        //create radio group
        radioButtonGroup = new ButtonGroup();

        //create label
        nameLabel = new JLabel("Name:");
        nationalityLabel = new JLabel("Nationality:");
        dateofbirthLabel = new JLabel("Date of Birth (eg.,31-01-1990):");
        genderLabel = new JLabel("Gender:");

        //create text field
        nameTextField = new JTextField(15);
        nationalityTextField = new JTextField(15);
        dateofbirthTextField = new JTextField(15);
    }

    protected void addComponents() {
        super.addComponents();

        //add label to sub panel
        namePanel.add(nameLabel, BorderLayout.CENTER);
        nationalityPanel.add(nationalityLabel, BorderLayout.CENTER);
        dateofbirthPanel.add(dateofbirthLabel, BorderLayout.CENTER);
        genderPanel.add(genderLabel, BorderLayout.WEST);

        //add radio button to sub panel
        radioButtonGroup.add(maleRadio);
        radioButtonGroup.add(femaleRadio);
        radioPanel.add(maleRadio, BorderLayout.WEST);
        radioPanel.add(femaleRadio, BorderLayout.CENTER);

        //add text field to sub panel
        namePanel.add(nameTextField, BorderLayout.EAST);
        nationalityPanel.add(nationalityTextField, BorderLayout.EAST);
        dateofbirthPanel.add(dateofbirthTextField, BorderLayout.EAST);
        genderPanel.add(radioPanel, BorderLayout.EAST);

        //add all panel to sub panel
        subPanel1.add(namePanel, BorderLayout.NORTH);
        subPanel1.add(nationalityPanel, BorderLayout.CENTER);
        subPanel2.add(dateofbirthPanel,BorderLayout.CENTER);
        subPanel2.add(genderPanel, BorderLayout.SOUTH);

        //add sub panel to main panel
        playerPanel.add(subPanel1, BorderLayout.NORTH);
        playerPanel.add(subPanel2, BorderLayout.CENTER);
        add(playerPanel, BorderLayout.CENTER);
    }

    public static void createAndShowGUI() {
        PlayerFormV1 msw = new PlayerFormV1("Player Form V1");
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
