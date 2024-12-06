package com.projet.app.view;

import com.projet.app.controller.Game;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class BetPanel extends JPanel{
  public BetPanel(CardLayout layout, JPanel mainPanel, Game game) {

    JPanel betPanel = new JPanel();

    JLabel betLabel = new JLabel("Combier voulez vous misez");
    betPanel.add(betLabel);
    TextField numberField = new TextField();
    betPanel.add(numberField);
    JLabel balanceLabel = new JLabel("Balance : " + game.getPlayer().getBalance());
    betPanel.add(balanceLabel);
    JButton betButton = new JButton("Miser");
    betPanel.add(betButton);

    add(betPanel);

    betButton.addActionListener(e -> {
      Integer valueBet = Integer.parseInt(numberField.getText());
      if (valueBet > game.getPlayer().getBalance()) {
        valueBet = game.getPlayer().getBalance();
      }

      game.setMise(valueBet);

      layout.show(mainPanel, "game");
    });
  }
}
