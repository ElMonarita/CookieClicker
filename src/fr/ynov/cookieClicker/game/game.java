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
        //String PlayerName = null;
        System.out.println("Welcome to Ynov Cookie Clicker");
        cookie cookies = new cookie(1);
        player player = new player("Zeldo", 0, 0);
        buildings autoclick = new buildings(0, 10, 1, "AutoClick");
        buildings mamie = new buildings(0, 20, 5, "Mamie");
        buildings mineCookie = new buildings(0, 30, 10, "MineCookie");
        upgradeClick upgrade = new upgradeClick(0, 10, 1, "UpgradeClick");
        JFrame frame = new JFrame("Choose Name Player");
        JFrame frame1 = new JFrame("Cookie Clicker");
        JLabel label = new JLabel("Cookie mama");
        JTextField words = new JTextField(10);
        JButton button = new JButton("Start");
        JButton button1 = new JButton("Click Me");
        JButton button2 = new JButton("Upgrade Me (click)");
        JButton button3 = new JButton("Upgrade Me (building1)");
        JButton button4 = new JButton("Upgrade Me (building2)");
        JButton button5 = new JButton("Upgrade Me (building3)");
        JPanel panel = new JPanel();
        JPanel panelShop = new JPanel();
        JPanel panelClickCookie = new JPanel();
        JPanel panelBuilding = new JPanel();

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame1.setSize(1000, 600);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setResizable(false);
        frame1.setLocationRelativeTo(null);

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
            System.out.println("you have click for gain cookie");
        });
        button2.setSize(40, 40);
        button2.addActionListener(e -> {
            if (player.possibilityPurchase(autoclick.getPrice())) {
                player.purchaseItems(autoclick.getPrice());
                autoclick.IncreaseQuantity();
                autoclick.IncreasePrice();
                System.out.println("Achat de autoclick et augmentation de la quantity et du prix");
            }else {
                System.out.println("echec d'achat");
            }
        });
        button3.setSize(40, 40);
        button3.addActionListener(e -> {
            if (player.possibilityPurchase(mamie.getPrice())) {
                player.purchaseItems(mamie.getPrice());
                mamie.IncreaseQuantity();
                mamie.IncreasePrice();
                System.out.println("Achat de mamie et augmentation de la quantity et du prix");
            }else {
                System.out.println("Echec d'achat");
            }
        });
        button4.setSize(40, 40);
        button4.addActionListener(e -> {
            if (player.possibilityPurchase(mineCookie.getPrice())) {
                player.purchaseItems(mineCookie.getPrice());
                mineCookie.IncreaseQuantity();
                mineCookie.IncreasePrice();
                System.out.println("Achat de mineCookie et augmentation de la quantity et du prix");
            }else {
                System.out.println("Echec d'achat");
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
                System.out.println("Achat d'upgrade et augmentation du prix et du gain cookie avec son niv");

            }else {
                System.out.println("Echec d'achat");
            }
        });

        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.BOLD, 10));

        panel.add(words);
        panel.add(button);
        panelClickCookie.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelClickCookie.add(button1);
        panelClickCookie.setBackground(Color.black);
        panelClickCookie.setBorder(BorderFactory.createLineBorder(Color.white));
        panelShop.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelShop.add(label);
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
        panelBuilding.add(button2, gbc);
        panelBuilding.setBackground(Color.yellow);
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
                label.setText("coucou " + player.getName() + " vous avez ramasser : " + player.getGainCookiePerSec() + "\n" +
                        "Voici votre nombre de Cookoin : " + player.getCookieMonney());
            }
        };
        timer.schedule(timerTask, 0, 1000);
    }
}
