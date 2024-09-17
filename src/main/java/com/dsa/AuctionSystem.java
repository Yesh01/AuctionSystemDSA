package com.dsa;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class AuctionSystem {
    private JFrame frame;

    public void initialize() {
        frame = new JFrame("Auction System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        // PRINT the Welcome Frame
        WelcomeFrame welcomeFrame = new WelcomeFrame(this);
        frame.setContentPane(welcomeFrame);
        frame.setVisible(true);
    }

    public void showPanel(JPanel panel) {
        frame.setContentPane(panel);
        frame.revalidate();
        frame.repaint();
    }
}

