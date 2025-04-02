package fr.ynov.cookieClicker.game;

import fr.ynov.cookieClicker.cookie.Cookie;
import fr.ynov.cookieClicker.item.buildings.Buildings;
import fr.ynov.cookieClicker.item.upgradeClick.UpgradeClick;
import fr.ynov.cookieClicker.player.Player;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

import java.awt.Font;
import java.awt.Image;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Represents a part of the famous game Cookie Clicker with simple functionalities.
 * I use the principles of OOP to make it easier to distribute certain examples.
 *
 * @author BORDES Rémy
 * @version 1.0
 * @since Java 21
 */

public class Game {

    public static void game() {
        //System.out.println("Welcome to Ynov Cookie Clicker");
        Cookie cookies = new Cookie(1);
        Player player = new Player("Zeldo", 0, 0);
        Buildings autoclick = new Buildings(0, 10, 1, "AutoClick");
        Buildings mamie = new Buildings(0, 20, 5, "Mamie");
        Buildings mineCookie = new Buildings(0, 30, 10, "MineCookie");
        UpgradeClick upgrade = new UpgradeClick(0, 10, 1, "UpgradeClick");
        ImageIcon icon = new ImageIcon("src\\fr\\ynov\\cookieClicker\\images\\icon.jpg");
        Image scaledImage = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(scaledImage);
        JFrame frame = new JFrame("Selection du Pseudo");
        JFrame frame1 = new JFrame("Cookie Clicker");
        JLabel label = new JLabel();
        JLabel label2 = new JLabel();
        JLabel labelPlayer = new JLabel();
        JTextField words = new JTextField(10);
        JButton button = new JButton("Start");
        JButton button1 = new JButton("Clique");
        JButton button2 = new JButton("Achete un autoclick pour : "+ autoclick.getPrice() + " Cookoin");
        JButton button3 = new JButton("Achete une Grand-mere pour : "+ mamie.getPrice() + " Cookoin");
        JButton button4 = new JButton("Achete une Mine pour : "+ mineCookie.getPrice() + " Cookoin");
        JButton button5 = new JButton("Achete une ameliorations de click pour : "+ upgrade.getPrice() + " Cookoin");
        JPanel panel = new JPanel();
        JPanel panelShop = new JPanel();
        JPanel panelClickCookie = new JPanel();
        JPanel panelBuilding = new JPanel();


        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setIconImage(icon.getImage());
        frame1.setSize(1000, 200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setResizable(false);
        frame1.setLocationRelativeTo(null);
        frame1.setIconImage(icon.getImage());

        //label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.BOLD, 10));
        labelPlayer.setText("Choisissez votre pseudo : ");
        labelPlayer.setFont(new Font("Arial", Font.BOLD, 10));

        button.setSize(40, 40);
        button.addActionListener(e -> {
            player.setName(words.getText());
            frame.setVisible(false);
            frame1.setVisible(true);
        });
        button1.setSize(40, 40);
        button1.setIcon(resizedIcon);
        button1.setLayout(new GridBagLayout());
        button1.addActionListener(e -> {
            player.increaseCookieMoney(cookies.getGainClick());
            String[] texte = {player.getName()+", voici vos Stat : ", "vous avez ramasser : "+ player.getCookieMonney() +" Cookoins", "Vous avez : " + mineCookie.getQuantity() +" mineCookies",
                    "Vous avez : " + mamie.getQuantity() +" mamies", "Vous avez : " + autoclick.getQuantity() +" autoclicks",
                    "Vous etes : " + upgrade.getLevel() +" Lvl for click", "Vous avez : " + player.getGainCookiePerSec() +" de Cookoins par seconde"
            };
            label.setText("<html>" + String.join("<br>", texte) + "</html>");
//            System.out.println("you have click for gain cookie");

        });
        button2.setSize(40, 40);
        button2.addActionListener(e -> {
            if (player.possibilityPurchase(autoclick.getPrice())) {
                player.purchaseItems(autoclick.getPrice());
                autoclick.IncreaseQuantity();
                autoclick.IncreasePrice();
                button2.setText("Achete un autoclick pour : "+ autoclick.getPrice() + " Cookoin");
                label2.setText("Vous avez réussi");
                String[] texte = {player.getName()+", voici vos Stat : ", "vous avez ramasser : "+ player.getCookieMonney() +" Cookoins", "Vous avez : " + mineCookie.getQuantity() +" mineCookies",
                        "Vous avez : " + mamie.getQuantity() +" mamies", "Vous avez : " + autoclick.getQuantity() +" autoclicks",
                        "Vous etes : " + upgrade.getLevel() +" Lvl for click", "Vous avez : " + player.getGainCookiePerSec() +" de Cookoins par seconde"
                };
                label.setText("<html>" + String.join("<br>", texte) + "</html>");
            }else {
                label2.setText("Vous n'avez pas assez");
            }
        });
        button3.setSize(40, 40);
        button3.addActionListener(e -> {
            if (player.possibilityPurchase(mamie.getPrice())) {
                player.purchaseItems(mamie.getPrice());
                mamie.IncreaseQuantity();
                mamie.IncreasePrice();
                button3.setText("Achete une Grand-mere pour : "+ mamie.getPrice() + " Cookoin");
                label2.setText("Vous avez réussi");
                String[] texte = {player.getName()+", voici vos Stat : ", "vous avez ramasser : "+ player.getCookieMonney() +" Cookoins", "Vous avez : " + mineCookie.getQuantity() +" mines",
                        "Vous avez : " + mamie.getQuantity() +" mamies", "Vous avez : " + autoclick.getQuantity() +" autoclicks",
                        "Vous etes : " + upgrade.getLevel() +" Lvl for click", "Vous avez : " + player.getGainCookiePerSec() +" de Cookoins par seconde"
                };
                label.setText("<html>" + String.join("<br>", texte) + "</html>");
            }else {
                label2.setText("Vous n'avez pas assez");
            }
        });
        button4.setSize(40, 40);
        button4.addActionListener(e -> {
            if (player.possibilityPurchase(mineCookie.getPrice())) {
                player.purchaseItems(mineCookie.getPrice());
                mineCookie.IncreaseQuantity();
                mineCookie.IncreasePrice();
                button4.setText("Achete une Mine pour : "+ mineCookie.getPrice() + " Cookoin");
                label2.setText("Vous avez réussi");

                String[] texte = {player.getName()+", voici vos Stat : ", "vous avez ramasser : "+ player.getCookieMonney() +" Cookoins", "Vous avez : " + mineCookie.getQuantity() +" mineCookies",
                        "Vous avez : " + mamie.getQuantity() +" mamies", "Vous avez : " + autoclick.getQuantity() +" autoclicks",
                        "Vous etes : " + upgrade.getLevel() +" Lvl for click", "Vous avez : " + player.getGainCookiePerSec() +" de Cookoins par seconde"
                };
                label.setText("<html>" + String.join("<br>", texte) + "</html>");
            }else {
                label2.setText("Vous n'avez pas assez");

            }
        });

        button5.setSize(40, 40);
        button5.addActionListener(e -> {
            if (player.possibilityPurchase(upgrade.getPrice())) {
                player.purchaseItems(upgrade.getPrice());
                cookies.IncreasegainClick(upgrade.getGainCookie());
                upgrade.IncreaseLevel();
                upgrade.IncreasePrice();
                upgrade.IncreaseGainCookie();
                button5.setText("Achete une ameliorations de click pour : "+ upgrade.getPrice() + " Cookoin");
                label2.setText("Vous avez réussi");
                String[] texte = {player.getName()+", voici vos Stat : ", "vous avez ramasser : "+ player.getCookieMonney() +" Cookoins", "Vous avez : " + mineCookie.getQuantity() +" mineCookies",
                        "Vous avez : " + mamie.getQuantity() +" mamies", "Vous avez : " + autoclick.getQuantity() +" autoclicks",
                        "Vous etes : " + upgrade.getLevel() +" Lvl for click", "Vous avez : " + player.getGainCookiePerSec() +" de Cookoins par seconde"
                };
                label.setText("<html>" + String.join("<br>", texte) + "</html>");
            }else {
                label2.setText("Vous n'avez pas assez");
            }
        });

        panel.add(labelPlayer, BorderLayout.WEST);
        panel.add(words);
        panel.add(button);
        panelClickCookie.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelClickCookie.add(button1);
        panelClickCookie.setBorder(BorderFactory.createLineBorder(Color.white));
        panelShop.add(label);
        panelShop.setBorder(BorderFactory.createLineBorder(Color.white));
        panelBuilding.add(label2);
        panelBuilding.add(button3);
        panelBuilding.add(button4);
        panelBuilding.add(button5);
        panelBuilding.add(button2);
        panelBuilding.setBorder(BorderFactory.createLineBorder(Color.white));

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
        frame1.add(panelClickCookie, BorderLayout.WEST);
        frame1.add(panelShop, BorderLayout.EAST);
        frame1.add(panelBuilding, BorderLayout.CENTER);

        Timer timer =new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                player.increaseCookieMoney(mineCookie.getGainCookie()+ mamie.getGainCookie()+ autoclick.getGainCookie());
                String[] texte = {player.getName()+", voici vos Stat : ", "vous avez ramasser : "+ player.getCookieMonney() +" Cookoins", "Vous avez : " + mineCookie.getQuantity() +" mineCookies",
                        "Vous avez : " + mamie.getQuantity() +" mamies", "Vous avez : " + autoclick.getQuantity() +" autoclicks",
                        "Vous etes : " + upgrade.getLevel() +" Lvl for click", "Vous avez : " + player.getGainCookiePerSec() +" de Cookoins par seconde"
                        };
                label.setText("<html>" + String.join("<br>", texte) + "</html>");
            }
        };
        timer.schedule(timerTask, 0, 1000);
    }
}