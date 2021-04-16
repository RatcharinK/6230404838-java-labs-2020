package harinsalai.ratchanon.lab10;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;

public class PlayerFormV7 extends PlayerFormV6{
    protected ListSelectionModel gameListSelect;
    protected boolean gamesListAdjusting;
    protected StringBuilder gameSelectInfo;

    public PlayerFormV7(String name) {
        super(name);
    }

    protected void addComponents() {
        super.addComponents();
    }

    protected void addListeners() {
        super.addListeners();
        gameListSelect = gamesList.getSelectionModel();
        gameListSelect.addListSelectionListener(this::gameListChange);
    }

    protected void gameListChange(ListSelectionEvent e) {
        ListSelectionModel gameListSelect = (ListSelectionModel) e.getSource();
        gamesListAdjusting = e.getValueIsAdjusting();
        if (!gamesListAdjusting) {
            if (gameListSelect.isSelectionEmpty()) {
                JOptionPane.showMessageDialog(this, "No game is selected",
                        "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
            }

            else {
                gameSelectInfo = new StringBuilder();
                int minSelected = gameListSelect.getMinSelectionIndex();
                int maxSelected = gameListSelect.getMaxSelectionIndex();
                for (int i = minSelected; i <= maxSelected; i++) {
                    if (gamesList.isSelectedIndex(i))
                        gameSelectInfo.append(gamesList.getModel().getElementAt(i).toString());
                        gameSelectInfo.append(", ");
                }

                gameSelectInfo.deleteCharAt(gameSelectInfo.length() - 2);
                JOptionPane.showMessageDialog(this, gameSelectInfo.toString(),
                        "Message", JOptionPane.INFORMATION_MESSAGE, javaIcon);
            }
        }
    }

    public static void createAndShowGUI() {
        PlayerFormV7 msw = new PlayerFormV7("Player Form V7");
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
