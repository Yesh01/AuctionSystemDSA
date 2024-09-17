package com.dsa.admin;

import com.dsa.AuctionSystem;
import com.dsa.controller.AuctionController;
import com.dsa.util.ImageUploader;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class AdminPanel extends JPanel {
    private JTextField itemNameField;
    private JTextField startingPriceField;
    private JLabel imageLabel;
    private JButton addItemButton;
    private JButton startAuctionButton;
    private JButton closePanelButton;
    private JTable itemTable;
    private DefaultTableModel tableModel;

    private AuctionController auctionController;

    public AdminPanel(AuctionSystem system) {
        this.auctionController = system;

        // Layout setup
        setLayout(new BorderLayout());

        // Create the left side panel for input fields
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(5, 2, 10, 10));

        // Item Name input
        leftPanel.add(new JLabel("Item Name:"));
        itemNameField = new JTextField();
        leftPanel.add(itemNameField);

        // Starting Price input
        leftPanel.add(new JLabel("Starting Price:"));
        startingPriceField = new JTextField();
        leftPanel.add(startingPriceField);

        // Image upload
        leftPanel.add(new JLabel("Upload Image:"));
        imageLabel = new JLabel();
        JButton uploadButton = new JButton("Upload Image");
        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File imageFile = ImageUploader.uploadImage();
                if (imageFile != null) {
                    imageLabel.setText(imageFile.getName());
                    // Handle image upload, possibly store the image path for future use
                }
            }
        });
        leftPanel.add(uploadButton);

        // Buttons for adding item and starting auction
        addItemButton = new JButton("Add Item");
        startAuctionButton = new JButton("Start Auction");
        closePanelButton = new JButton("Close Panel");

        leftPanel.add(addItemButton);
        leftPanel.add(startAuctionButton);
        leftPanel.add(closePanelButton);

        add(leftPanel, BorderLayout.WEST);

        // Table setup for right panel
        String[] columnNames = {"Item Name", "Image", "Starting Price", "Bidder Name", "Sold At"};
        tableModel = new DefaultTableModel(columnNames, 0);
        itemTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(itemTable);
        add(scrollPane, BorderLayout.CENTER);

        // Button actions
        addItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addItem();
            }
        });

        startAuctionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startAuction();
            }
        });

        closePanelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closePanel();
            }
        });
    }

    private void addItem() {
        String itemName = itemNameField.getText();
        String startingPriceStr = startingPriceField.getText();
        String imageFileName = imageLabel.getText();

        if (itemName.isEmpty() || startingPriceStr.isEmpty() || imageFileName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill out the required fields.");
            return;
        }

        try {
            double startingPrice = Double.parseDouble(startingPriceStr);
            auctionController.addItem(itemName, startingPrice, imageFileName);
            tableModel.addRow(new Object[]{itemName, imageFileName, startingPrice, null, null});
            JOptionPane.showMessageDialog(this, "Item added successfully.");
            clearFields();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Starting price must be a valid number.");
        }
    }

    private void startAuction() {
        if (tableModel.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No items to start auction.");
            return;
        }
        // Start the auction logic
        auctionController.startAuction();
        JOptionPane.showMessageDialog(this, "Auction started successfully.");
    }

    private void closePanel() {
        // Logic to go back to the login panel or exit
        auctionController.closeAdminPanel();
    }

    private void clearFields() {
        itemNameField.setText("");
        startingPriceField.setText("");
        imageLabel.setText("");
    }
}
