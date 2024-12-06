package com.projet.app.view;

import java.awt.CardLayout;
import com.projet.app.controller.Game;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
  public MainFrame() {

    this.setTitle("MelvinBlack");
    this.setSize(800, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    CardLayout cardLayout = new CardLayout();
    JPanel mainPanel = new JPanel(cardLayout);

    Game game = new Game();
    HomePanel homePanel = new HomePanel(cardLayout, mainPanel);
    GamePanel gamePanel = new GamePanel(cardLayout, mainPanel, game);
    BetPanel betPanel = new BetPanel(cardLayout, mainPanel, game);
    mainPanel.add(homePanel, "home");
    mainPanel.add(gamePanel, "game");
    mainPanel.add(betPanel, "bet");

    add(mainPanel);
    cardLayout.show(mainPanel, "home");
    this.setVisible(true);
    
  }
}
