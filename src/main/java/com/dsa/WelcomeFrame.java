package com.dsa;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.dsa.admin.AdminPanel;
import com.dsa.customer.CustomerPanel;

public class WelcomeFrame extends JFrame {

    private AuctionSystem system;

    public WelcomeFrame(AuctionSystem system) {
        this.system = system;
        initComponents();
    }

    private void initComponents() {
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Auction Online House");

        // Create the button group and radio buttons for Admin and Customer
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton adminButton = new JRadioButton("Admin", true);
        JRadioButton customerButton = new JRadioButton("Customer");

        // Add the radio buttons to the button group
        buttonGroup.add(adminButton);
        buttonGroup.add(customerButton);

        // Create the panel for the buttons and layout settings
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 10, 10)); // 1 row, 2 columns, spacing between buttons
        buttonPanel.add(adminButton);
        buttonPanel.add(customerButton);

        // Create a label for the welcome message
        JLabel welcomeLabel = new JLabel("Welcome to Auction Online House!", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 16));
        welcomeLabel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Add some padding

        // Main container layout (vertical box)
        setLayout(new BorderLayout());
        add(welcomeLabel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        // Add ActionListener to buttons to navigate to respective panels
        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAdminPanel();
            }
        });

        customerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openCustomerPanel();
            }
        });

        // Adjust the window size and location
        pack();
        setLocationRelativeTo(null); // Center the frame on screen
    }

    // Methods to navigate between Admin and Customer panels
    private void openAdminPanel() {
        system.showPanel(new AdminPanel(system));
    }

    private void openCustomerPanel() {
        system.showPanel(new CustomerPanel(system));
    }
}
