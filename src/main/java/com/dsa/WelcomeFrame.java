package com.dsa;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dsa.admin.AdminPanel;
import com.dsa.customer.CustomerPanel;

public class WelcomeFrame extends JFrame {

    private AuctionSystem auctionSystem;

    public WelcomeFrame(AuctionSystem auctionSystem) {

        this.auctionSystem = auctionSystem;
        setTitle("Auction Online House - Welcome");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void showWelcomeScreen() {

        JPanel panel = new JPanel();
        JLabel welcomPanel = new JLabel("[ :> ] Welcome to Auction Online House!");

        JButton adminButton = new JButton("Admin");
        JButton customerButton = new JButton("Customer");

        
        // ----> Auction Listener for Buttons Above. 
        adminButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent y) {
                auctionSystem.showAdminPanel();
            }
        });

        customerButton.addActionListener((new ActionListener() {
            public void actionPerformed(ActionEvent y) {
                // auctionSystem.showCustomerPanel();
            }
        }));

        panel.add(welcomPanel);
        panel.add(adminButton);
        panel.add(customerButton);
        add(panel);
        setVisible(true);

    }

}