package harinsalai.ratchanon.lab10;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class PlayerFormV6 extends PlayerFormV5 {

    protected PlayerFormV6(String name) {
        super(name);
    }

    protected void addComponents() {
        super.addComponents();
        setDefult();
    }

    protected void addListeners() {
        super.addListeners();
        maleRadio.addActionListener(this::actionPerformed);
        femaleRadio.addActionListener(this::actionPerformed);
    }

    protected void handleRadio() {
        if (femaleRadio.isSelected()) {
            JOptionPane.showMessageDialog(this, "Gender is update to Female",
                    "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
        }

        else if (maleRadio.isSelected()) {
            JOptionPane.showMessageDialog(this, "Gender is update to Male",
                    "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
        }
    }

    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object src = e.getSource();
        if (src == maleRadio) {
            handleRadio();
        }

        else if (src == femaleRadio) {
            handleRadio();
        }

    }

    public static void createAndShowGUI() {
        PlayerFormV6 msw = new PlayerFormV6("Player Form V6");
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
