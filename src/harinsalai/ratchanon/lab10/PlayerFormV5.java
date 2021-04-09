package harinsalai.ratchanon.lab10;

import harinsalai.ratchanon.lab8.PlayerFormV4;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class PlayerFormV5 extends PlayerFormV4 {
    protected StringBuilder info;
    protected StringBuffer resultBuffer;
    protected String nameInfo = "", nationalityInfo = "", dateofbirthInfo = "", playerTypeInfo = "";
    protected ImageIcon javaIcon = new ImageIcon("src/harinsalai/ratchanon/image/Java-icon.png");


    protected PlayerFormV5(String name) {
        super(name);
    }

    protected void setDefult() {
        nameTextField.setText("Manee");
        nationalityTextField.setText("Thai");
        dateofbirthTextField.setText("31-01-2000");
    }

    protected void addComponents() {
        super.addComponents();
        setDefult();
    }

    protected void addListeners() {
        submitButton.addActionListener(this::actionPerformed);
        resetButton.addActionListener(this::actionPerformed);
        nameTextField.addActionListener(this::actionPerformed);
        nationalityTextField.addActionListener(this::actionPerformed);
        dateofbirthTextField.addActionListener(this::actionPerformed);
        playerTypeComboBox.addActionListener(this::actionPerformed);
    }

    protected void handleSubmitButton() {
        StringBuilder mainInfo = changeInfo();
        JOptionPane.showMessageDialog(this, mainInfo,
                "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
    }

    protected void handleResetButton() {
        nameTextField.setText("");
        nameInfo = nameTextField.getText();
        nationalityTextField.setText("");
        nationalityInfo = nationalityTextField.getText();
        dateofbirthTextField.setText("");
        dateofbirthInfo = nationalityTextField.getText();
    }

    protected void handleTextfield(JTextField JTextField) {
        //name
        if (!nameTextField.getText().equals(nameInfo)) {
            nameInfo = nameTextField.getText();
            String nameInfoTrue = "Name is update to " + nameInfo;
            JOptionPane.showMessageDialog(this, nameInfoTrue,
                    "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
        }

        //nationality
        else if (!nationalityTextField.getText().equals(nationalityInfo)) {
            nationalityInfo = nationalityTextField.getText();
            String nationalityInfoTrue = "Nationality is update to " + nationalityInfo;
            JOptionPane.showMessageDialog(this, nationalityInfoTrue,
                    "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
        }

        //date of birth
        else if (!dateofbirthTextField.getText().equals(dateofbirthInfo)) {
            dateofbirthInfo = dateofbirthTextField.getText();
            String dateofbirthInfoTrue = "Birthdate is update to " + dateofbirthInfo;
            JOptionPane.showMessageDialog(this, dateofbirthInfoTrue,
                    "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
        }
    }

    protected void handleComboBox() {
        playerTypeInfo = playerTypeComboBox.getSelectedItem().toString();
        String playerTypeInfoTrue = "Player type is updated to " + playerTypeInfo;
        JOptionPane.showMessageDialog(this, playerTypeInfoTrue,
                "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
    }

    protected StringBuilder changeInfo() {
        info = new StringBuilder();
        info.append(nameTextField.getText());
        info.append(" has nationality as " + nationalityTextField.getText());
        info.append(", birthdate as " + dateofbirthTextField.getText());
        if (maleRadio.isSelected()) {
            info.append(", gender as Male");
        }
        else {
            info.append(", gender as Female");
        }
        info.append(" player type as " + playerTypeComboBox.getSelectedItem().toString());
        return info;
    }

    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        resultBuffer = new StringBuffer();
        if (src == submitButton) {
            handleSubmitButton();
        }

        else if (src == resetButton) {
            handleResetButton();
        }

        else if (src instanceof JTextField) {
            JTextField tf = (JTextField) src;
            handleTextfield(tf);
        }

        else if (src == playerTypeComboBox) {
            handleComboBox();
        }
    }

    public static void createAndShowGUI() {
        PlayerFormV5 msw = new PlayerFormV5("Player Form V5");
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
