package fr.ynov.cookieClicker.game;

import fr.ynov.cookieClicker.cookie.cookie;
import fr.ynov.cookieClicker.item.buildings.buildings;
import fr.ynov.cookieClicker.item.upgradeClick.upgradeClick;
import fr.ynov.cookieClicker.player.player;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class game {

    public static void main(String[] args) {
        //System.out.println("Welcome to Ynov Cookie Clicker");
        cookie cookies = new cookie(1);
        player player = new player("Zeldo", 0, 0);
        buildings autoclick = new buildings(0, 10, 1, "AutoClick");
        buildings mamie = new buildings(0, 20, 5, "Mamie");
        buildings mineCookie = new buildings(0, 30, 10, "MineCookie");
        upgradeClick upgrade = new upgradeClick(0, 10, 1, "UpgradeClick");
        JFrame frame = new JFrame("Choose Name Player");
        JFrame frame1 = new JFrame("Cookie Clicker");
        JLabel label = new JLabel();
        JLabel label2 = new JLabel();
        JLabel labelPlayer = new JLabel();
        JTextField words = new JTextField(10);
        JButton button = new JButton("Start");
        JButton button1 = new JButton("Click Me");
        JButton button2 = new JButton("Buy AutoClick for : "+ autoclick.getPrice() + " Cookoin");
        JButton button3 = new JButton("Buy GrandMa for : "+ mamie.getPrice() + " Cookoin");
        JButton button4 = new JButton("Buy MineCookie for : "+ mineCookie.getPrice() + " Cookoin");
        JButton button5 = new JButton("Buy UpgradeClick for : "+ upgrade.getPrice() + " Cookoin");
        JPanel panel = new JPanel();
        JPanel panelShop = new JPanel();
        JPanel panelClickCookie = new JPanel();
        JPanel panelBuilding = new JPanel();


        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame1.setSize(1000, 600);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame1.setResizable(false);
        frame1.setLocationRelativeTo(null);

        //label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.BOLD, 10));
        labelPlayer.setText("Choose Name Player : ");
        labelPlayer.setFont(new Font("Arial", Font.BOLD, 10));

        button.setSize(40, 40);
        button.addActionListener(e -> {
            player.setName(words.getText());
            frame.setVisible(false);
            frame1.setVisible(true);
        });
        button1.setSize(40, 40);
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
                button2.setText("Buy AutoClick for : "+ autoclick.getPrice() + " Cookoin");
                label2.setText("You success");
                String[] texte = {player.getName()+", voici vos Stat : ", "vous avez ramasser : "+ player.getCookieMonney() +" Cookoins", "Vous avez : " + mineCookie.getQuantity() +" mineCookies",
                        "Vous avez : " + mamie.getQuantity() +" mamies", "Vous avez : " + autoclick.getQuantity() +" autoclicks",
                        "Vous etes : " + upgrade.getLevel() +" Lvl for click", "Vous avez : " + player.getGainCookiePerSec() +" de Cookoins par seconde"
                };
                label.setText("<html>" + String.join("<br>", texte) + "</html>");
            }else {
                label2.setText("Erreur buy");
            }
        });
        button3.setSize(40, 40);
        button3.addActionListener(e -> {
            if (player.possibilityPurchase(mamie.getPrice())) {
                player.purchaseItems(mamie.getPrice());
                mamie.IncreaseQuantity();
                mamie.IncreasePrice();
                button3.setText("Buy GrandMa for : "+ mamie.getPrice() + " Cookoin");
                label2.setText("You success");
                String[] texte = {player.getName()+", voici vos Stat : ", "vous avez ramasser : "+ player.getCookieMonney() +" Cookoins", "Vous avez : " + mineCookie.getQuantity() +" mineCookies",
                        "Vous avez : " + mamie.getQuantity() +" mamies", "Vous avez : " + autoclick.getQuantity() +" autoclicks",
                        "Vous etes : " + upgrade.getLevel() +" Lvl for click", "Vous avez : " + player.getGainCookiePerSec() +" de Cookoins par seconde"
                };
                label.setText("<html>" + String.join("<br>", texte) + "</html>");
            }else {
                label2.setText("Erreur buy");
            }
        });
        button4.setSize(40, 40);
        button4.addActionListener(e -> {
            if (player.possibilityPurchase(mineCookie.getPrice())) {
                player.purchaseItems(mineCookie.getPrice());
                mineCookie.IncreaseQuantity();
                mineCookie.IncreasePrice();
                button4.setText("Buy MineCookie for : "+ mineCookie.getPrice() + " Cookoin");
                label2.setText("You success");
                String[] texte = {player.getName()+", voici vos Stat : ", "vous avez ramasser : "+ player.getCookieMonney() +" Cookoins", "Vous avez : " + mineCookie.getQuantity() +" mineCookies",
                        "Vous avez : " + mamie.getQuantity() +" mamies", "Vous avez : " + autoclick.getQuantity() +" autoclicks",
                        "Vous etes : " + upgrade.getLevel() +" Lvl for click", "Vous avez : " + player.getGainCookiePerSec() +" de Cookoins par seconde"
                };
                label.setText("<html>" + String.join("<br>", texte) + "</html>");
            }else {
                label2.setText("Erreur buy");
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
                button5.setText("Buy UpgradeClick for : "+ upgrade.getPrice() + " Cookoin");
                label2.setText("You success");
                String[] texte = {player.getName()+", voici vos Stat : ", "vous avez ramasser : "+ player.getCookieMonney() +" Cookoins", "Vous avez : " + mineCookie.getQuantity() +" mineCookies",
                        "Vous avez : " + mamie.getQuantity() +" mamies", "Vous avez : " + autoclick.getQuantity() +" autoclicks",
                        "Vous etes : " + upgrade.getLevel() +" Lvl for click", "Vous avez : " + player.getGainCookiePerSec() +" de Cookoins par seconde"
                };
                label.setText("<html>" + String.join("<br>", texte) + "</html>");
            }else {
                label2.setText("Erreur buy");
            }
        });

        panel.add(labelPlayer, BorderLayout.WEST);
        panel.add(words);
        panel.add(button);
        panelClickCookie.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelClickCookie.add(button1);
        //panelClickCookie.setBackground(Color.black);
        panelClickCookie.setBorder(BorderFactory.createLineBorder(Color.white));
        panelShop.add(label, SwingConstants.CENTER);
        //panelShop.setBackground(Color.red);
        panelShop.setBorder(BorderFactory.createLineBorder(Color.white));
        panelBuilding.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10);
        panelBuilding.add(label2);
        panelBuilding.add(button3, gbc);
        panelBuilding.add(button4, gbc);
        panelBuilding.add(button5, gbc);
        panelBuilding.add(button2, gbc);
        //panelBuilding.setBackground(Color.yellow);
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