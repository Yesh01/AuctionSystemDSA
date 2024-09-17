package com.dsa;

import com.dsa.admin.AdminPanel;
import com.dsa.customer.CustomerPanel;

public class AuctionSystem {

    private AdminPanel adminPanel;
    private CustomerPanel customerPanel;
    private WelcomeFrame welcomeFrame;

    public AuctionSystem() {

        this.welcomeFrame = new WelcomeFrame(this);
        this.adminPanel = new AdminPanel(this);
        this.customerPanel = new CustomerPanel(this);
    }

    public void lunch() {
        welcomeFrame.showWelcomeScreen();
    }

    public void showAdminPanel() {
        welcomeFrame.setVisible(false);
        // customerPanel.showCustomerPanel();
    }

    public void returnToWelcomeScreen() {
        adminPanel.setVisible(false);
        customerPanel.setVisible(false);
        welcomeFrame.setVisible(true);
    }
}


