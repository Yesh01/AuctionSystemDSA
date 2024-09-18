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
import java.time.Year;

public class AdminPanel extends JPanel {

    private AuctionSystem auctionSystem;
    private AuctionController auctionController;

    private JTextField itemNameField;
    private JTextField startingPriceField;
    private JLabel imageLabel;
    private JTable auctionTable;

    public AdminPanel(AuctionSystem auctionSystem) {

        this.auctionSystem = auctionSystem;
        this.auctionController = auctionController;

        
        setTitle("Admin Panel");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(null);

        dfComponents();

    }

    public void dfComponents(){

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

        JLabel itemNamePanel = new JLabel("Item Name: ");
        itemNameField = new JTextField(20);

        JLabel startingPriceJLabel = new JLabel("Starting Price: ");
        startingPriceField = new JTextField(20);

        JButton imageUploadButton = new JButton("Upload Image");
        imageLabel = new JLabel("No Image Uploaded");

        JButton addItemButton = new JButton("Add Item");
        JButton startAuctionButton = new JButton("Start Auction");
        JButton closeButton = new JButton("Close Panel");

        // UI Components in the [LEFT SIDE] --->

        // leftPanel.add(itemNameLabel);
        leftPanel.add(itemNameField);
        leftPanel.add(startingPriceJLabel);
        leftPanel.add(startingPriceField);
        leftPanel.add(imageUploadButton);
        leftPanel.add(addItemButton);
        leftPanel.add(startAuctionButton);
        leftPanel.add(closeButton);

        // --> Table UI 

        auctionTable = new JTable(); // TO-DO Set-up Table to Display Items & Bids.
        JScrollPane scrollPane = new JScrollPane(auctionTable);

        // All Action Listner --> 
        addItemButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent y) {
                // handledAddItem();
            }
        });

        startAuctionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent y) {
                // handleStartAuction();
            }
        });

        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent y) {
                auctionSystem.returnToWelcomeScreen();
            }
        });

        imageUploadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent y) {
                // handleImageUpload();
            }
        });

        // ----------> Main Layout [ Admin Panel ]
        
        setLayout(new BorderLayout());
        add(leftPanel, BorderLayout.WEST);
        add(scrollPane, BorderLayout.CENTER);

    }

    // -----------> Functionality 

    private void handledAddItem(){

    }

    private void handleStartAuction(){

    }

    private void handleImageUpload(){

    }
    private void showAdminPanel(){
        setVisible(true);
    }


}