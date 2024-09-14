package com.dsa;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AuctionSystem system = new AuctionSystem();
            system.initialize();
        });
    }
}