package com.dsa.admin;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;  
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import com.dsa.AuctionSystem; // Connectivity Overall SUPEFAST
import com.dsa.WelcomeFrame;

/**
 * ADMIN PANEL
 * - Adding ITEMS -> Button
 * - START Auction  -> Button
 * - CLOSE Panel -> Button
 * - VISIABLE Table Lists -> Table
 */
public class AdminPanel extends JFrame {

    // Initialization Here -->

    private AuctionManager auctionManager;
    private JTextField itemNameField, priceField;
    private JLabel imageLabel;
    private JButton addButton, startAuctionButton, closeButton;
    private JTable auctionTable;
    private ImageIcon selImageIcon;


    public AdminPanel(AuctionSystem system) {

        setLayout(new BorderLayout());
        this.auctionManager = new AuctionManager();

        setTitle("Admin Panel ~ Auction Management");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // LEFT SIDE OF THE PANEL
        JPanel leftJPanel = new JPanel();
        leftJPanel.setLayout(new GridLayout(6,1));

        itemNameField = new JTextField();
        priceField = new JTextField();
        imageLabel = new JLabel("No Image Selected", SwingConstants.CENTER);

        addButton = new JButton("Add Item");
        startAuctionButton = new JButton("Start Auction");
        closeButton = new JButton("Close");

        leftJPanel.add(new JLabel("Item Name: "));
        leftJPanel.add(itemNameField);
        leftJPanel.add(new JLabel("Price: "));
        leftJPanel.add(priceField);
        leftJPanel.add(imageLabel);
        leftJPanel.add(addButton);

        // RIGHT SIDE OF THE PANEL
        JPanel rightPanel = new JPanel(new BorderLayout());
        // auctionTable new JTable();

        // JScrollPane scrollPane = new JPanel(auctionTable);
        // rightPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2));
        buttonPanel.add(startAuctionButton);
        buttonPanel.add(closeButton);

        rightPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(leftJPanel, BorderLayout.WEST);
        add(rightPanel, BorderLayout.CENTER);

        // ACTION LISTNERS
        
        addButton.addActionListener((new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                handleAddItem();
            }
            }));



        closeButton.addActionListener(e -> system.showPanel(new WelcomeFrame(system)));

        
    }

    //---------------------------------FUNCTIONALITY DEVELOPMENT HERE------------------------------>

    private void handleAddItem() {
        // FUNC to add item in [TABLE VIEW]
    }

    private void handleStartAuction() {
        // FUNC to [START AUCTION] 
        // NOT JUST STRART Button, Include Error IFs
    }

    private  void handleCLosePanel() {
        // CLOSE BUTTON --> Back to Main Scree [Option fro Admin or Customer]
    }

    private void handleImageUpload() {
        // Thinking for the best way to Upload
        // I Guess use upload just from local device.
    }

    private void updateAuctionTable() {

    }

    // Testing Block

  
    }

