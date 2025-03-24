package fr.ynov.cookieClicker.view;

import javax.swing.*;
import java.awt.*;

public class loginWindows {

    static JFrame frame = new JFrame("Choose Name Player");
    static JTextField words = new JTextField(10);
    static JButton button = new JButton("Start");
    static JPanel panel = new JPanel();
    static String PlayerName;

    public static void FrameWindows() {
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                       //Permet de fermer l'interface
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

    public static void ButtonWindows() {
        button.setSize(40, 40);
        button.addActionListener(e -> {
            frame.setVisible(false);
        });
    }
    public static void PanelWindows() {
        panel.add(words);
        panel.add(button);
    }
    public static void SetupWindows() {
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
