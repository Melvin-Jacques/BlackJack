package com.projet.app.view;

import java.util.List;
import com.projet.app.model.Card;

import com.projet.app.view.ActionPanel;
import javax.swing.*;
import java.awt.*;

import com.projet.app.controller.Game;

public class GamePanel extends JPanel {
  private Game game;
    private JPanel dealerCardsPanel;
    private JPanel playerCardsPanel;
    private JLabel dealerScoreLabel;
    private JLabel playerScoreLabel;
  
  public GamePanel(CardLayout layout, JPanel mainPanel, Game game) {
    this.game = game;
    // int col = 0;
    // int row = 0;
    ActionPanel actionPanel = new ActionPanel(layout, this, mainPanel);
    // ImageTest cardImage = new ImageTest(col, row);
    setLayout(new BorderLayout());

    JPanel centerPanel = new JPanel();
      centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
      add(centerPanel, BorderLayout.CENTER);

      JPanel dealerPanel = new JPanel();
      dealerPanel.setLayout(new BoxLayout(dealerPanel, BoxLayout.Y_AXIS));
      JLabel dealerLabel = new JLabel("Cartes du croupier");
      dealerScoreLabel = new JLabel("Score du croupier : 0");
      dealerScoreLabel.setAlignmentX(CENTER_ALIGNMENT);
      dealerLabel.setAlignmentX(CENTER_ALIGNMENT);
      dealerCardsPanel = new JPanel();
      dealerCardsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 2));
      dealerPanel.add(dealerLabel);
      dealerPanel.add(dealerScoreLabel);
      dealerPanel.add(dealerCardsPanel);
      centerPanel.add(dealerPanel);

      JPanel playerPanel = new JPanel();
      playerPanel.setLayout(new BoxLayout(playerPanel, BoxLayout.Y_AXIS));
      JLabel playerLabel = new JLabel("Carte du joueur");
      playerScoreLabel = new JLabel("Score du joueur : 0");
      playerScoreLabel.setAlignmentX(CENTER_ALIGNMENT);
      playerLabel.setAlignmentX(CENTER_ALIGNMENT);
      playerCardsPanel = new JPanel();
      playerCardsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 2));
      playerPanel.add(playerLabel);
      playerPanel.add(playerScoreLabel);
      playerPanel.add(playerCardsPanel);
      centerPanel.add(playerPanel);

      game.startGame();
      updateGameState();
    // JPanel cards = new JPanel();
    // cards.setLayout(new BoxLayout(cards, BoxLayout.X_AXIS));
    // cards.setBackground(Color.RED);

    // ImageTest cardImage2 = new ImageTest(1, row);
    // ImageTest cardImage3 = new ImageTest(2, row);

    // JLabel label = new JLabel("Game Panel");
    // for (int i = 0; i <11; i++) {
    //   // ImageTest cardImage = new ImageTest(i, row);

    //   // cards.add(cardImage);
    // }

    // cards.add(cardImage);
    // cards.add(cardImage2);
    // cards.add(cardImage3);
    // add(cards, BorderLayout.CENTER);
    // add(label, BorderLayout.NORTH);
    add(actionPanel, BorderLayout.SOUTH);
  }

  private void updateGameState() {
    updateCards(dealerCardsPanel, game.getDealer().getHand());

    updateCards(playerCardsPanel, game.getPlayer().getHand());

    playerScoreLabel.setText("Score du joueur : " + game.getPlayer().calculScore());

    dealerScoreLabel.setText("Score du croupier : " + game.getDealer().calculScore());
  }

private void updateCards(JPanel panel, List<Card> hand) {
    for (Card card : hand) {
        panel.add(new CardManager(card.getColumn(), card.getRow()));
    }
}

}
