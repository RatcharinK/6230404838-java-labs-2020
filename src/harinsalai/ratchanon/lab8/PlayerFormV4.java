package harinsalai.ratchanon.lab8;

import javax.swing.*;

public class PlayerFormV4 extends PlayerFormV3 {
    protected JMenuBar mainMenuBar;
    protected JMenu fileMenu, configMenu, colorMenu, sizeMenu;
    protected ImageIcon newIcon, openIcon, saveIcon;
    protected JMenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem,
            redMenuItem, greenMenuItem, blueMenuItem, size16MenuItem, size20MenuItem, size24MenuItem;
    protected PlayerFormV4(String name) {
        super(name);
    }

    protected void setComponents() {
        super.setComponents();
        //create menubar
        mainMenuBar = new JMenuBar();

        //create menu
        fileMenu = new JMenu("File");
        configMenu = new JMenu("Config");

        //create sub menu
        colorMenu = new JMenu("Color");
        sizeMenu = new JMenu("Size");

        //create menu item
        newMenuItem = new JMenuItem("New");
        openMenuItem = new JMenuItem("Open");
        saveMenuItem = new JMenuItem("Save");
        exitMenuItem = new JMenuItem("Exit");
        redMenuItem = new JMenuItem("Red");
        greenMenuItem = new JMenuItem("Green");
        blueMenuItem = new JMenuItem("Blue");
        size16MenuItem = new JMenuItem("16");
        size20MenuItem = new JMenuItem("20");
        size24MenuItem = new JMenuItem("24");

        //set icon to menu item
        newIcon = new ImageIcon("src/harinsalai/ratchanon/image/New-icon.png");
        newMenuItem.setIcon(newIcon);
        saveIcon = new ImageIcon("src/harinsalai/ratchanon/image/Save-icon.png");
        saveMenuItem.setIcon(saveIcon);
        openIcon = new ImageIcon("src/harinsalai/ratchanon/image/Open-icon.png");
        openMenuItem.setIcon(openIcon);
    }

    protected void addComponents() {
        super.addComponents();

        //add menu item to sub menu
        colorMenu.add(redMenuItem);
        colorMenu.add(greenMenuItem);
        colorMenu.add(blueMenuItem);
        sizeMenu.add(size16MenuItem);
        sizeMenu.add(size20MenuItem);
        sizeMenu.add(size24MenuItem);

        //add item to menu
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        //add sub menu to menu
        configMenu.add(colorMenu);
        configMenu.add(sizeMenu);

        //add menu to menu bar
        mainMenuBar.add(fileMenu);
        mainMenuBar.add(configMenu);

        //add menu bar to JFrame
        setJMenuBar(mainMenuBar);

    }

    public static void createAndShowGUI() {
        PlayerFormV4 msw = new PlayerFormV4("Player Form V4");
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
