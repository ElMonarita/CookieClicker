package fr.ynov.cookieClicker.view;

import javax.swing.*;
import java.awt.*;

public class cookieWindows {

    static JFrame frame= new JFrame("Cookie Clicker");
    static JLabel label = new JLabel("Cookie mama");
    static JButton button1 = new JButton("Click Me");
    static JButton button2 = new JButton("Upgrade Me (click)");
    static JButton button3 = new JButton("Upgrade Me (building1)");
    static JButton button4 = new JButton("Upgrade Me (building2)");
    static JButton button5 = new JButton("Upgrade Me (building3)");
    static JPanel panelShop = new JPanel();
    static JPanel panelClickCookie = new JPanel();
    static JPanel panelBuilding = new JPanel();

    public static void FrameWindows(){
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                       //Permet de fermer l'interface
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }
    public static void ButtonWindows(){
        button1.setSize(40, 40);
        button1.setLayout(new GridBagLayout());
        button1.addActionListener(e -> {
            System.out.println("button1 clicked");
        });
        button2.setSize(40, 40);
        button2.addActionListener(e -> {
            System.out.println("button2 clicked");
        });
        button3.setSize(40, 40);
        button3.addActionListener(e -> {
            System.out.println("button3 clicked");
        });
        button4.setSize(40, 40);
        button4.addActionListener(e -> {
            System.out.println("button4 clicked");
        });
        button5.setSize(40, 40);
        button5.addActionListener(e -> {
            System.out.println("button5 clicked");
        });
    }
    public static void PanelWindows(){
        panelClickCookie.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelClickCookie.add(label);
        panelClickCookie.add(button1);
        panelClickCookie.setBackground(Color.black);
        panelClickCookie.setBorder(BorderFactory.createLineBorder(Color.white));
        panelShop.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelShop.add(button2);
        panelShop.setBackground(Color.red);
        panelShop.setBorder(BorderFactory.createLineBorder(Color.white));
        panelBuilding.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10);
        panelBuilding.add(button3, gbc);
        panelBuilding.add(button4, gbc);
        panelBuilding.add(button5, gbc);
        panelBuilding.setBackground(Color.yellow);
        panelBuilding.setBorder(BorderFactory.createLineBorder(Color.white));
    }
    public static void SetupWindows(){
        frame.add(panelClickCookie, BorderLayout.WEST);
        frame.add(panelShop, BorderLayout.EAST);
        frame.add(panelBuilding, BorderLayout.CENTER);
        frame.setVisible(true);
    }

}
