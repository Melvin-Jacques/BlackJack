package com.projet.app.view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
  public MainFrame() {

    this.setTitle("MelvinBlack");
    this.setSize(800, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    CardLayout cardLayout = new CardLayout();
    JPanel mainPanel = new JPanel(cardLayout);

    HomePanel homePanel = new HomePanel(cardLayout, mainPanel);
    GamePanel gamePanel = new GamePanel(cardLayout, mainPanel);
    // GamePanel gamePanel = new GamePanel();
    mainPanel.add(homePanel, "home");
    mainPanel.add(gamePanel, "game");
    

    add(mainPanel);
    cardLayout.show(mainPanel, "home");
    this.setVisible(true);
    
  }
}
