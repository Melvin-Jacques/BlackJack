package com.projet.app.view;

import javax.swing.*;

import com.projet.app.App;
import com.projet.app.controller.Game;
import com.projet.app.model.Player;

import java.awt.*;

public class ActionPanel extends JPanel {
  public Game game;
  public ActionPanel(Game game,Runnable updateGame) {
      //je veux afficher 3 bouton en ligne separé par un petit espace pour ensuite mettre ce panel dans gamepanel
      //avec un flow layout
       
      this.game = game;

      setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
      JButton hit = new JButton("Hit");
      JButton stand = new JButton("Stand");
      JButton doubleDown = new JButton("Double");

      hit.addActionListener(e -> {
        game.playerHit();
        updateGame.run();
        if (game.getPlayer().isBust()) {
            JOptionPane.showMessageDialog(this, game.getWinner());
        }
    });
      
      stand.addActionListener(e -> {
          game.dealerPlay();
          updateGame.run();
          JOptionPane.showMessageDialog(this, game.getWinner());
      });

      doubleDown.addActionListener(e -> {
          //gamePanel.doubleDown();
          // System.out.println( gameMise.getMise() * 2);
          // layout.show(mainPanel, "game");
      });

      JLabel gains = new JLabel("Gains");
      int value = 1000;
      JLabel gainNumber = new JLabel(String.valueOf(value));
      gainNumber.setBackground(Color.darkGray);

      JLabel total = new JLabel("Total");
      JLabel totalNumber = new JLabel(game.getMise() + "");
      totalNumber.setBackground(Color.darkGray);

      JLabel balance = new JLabel("Balance");
      JLabel balanceNumber = new JLabel(String.valueOf(value));
    //   balanceNumber.setOpaque(true);
    //   balanceNumber.setBackground(Color.GREEN);

      add(balance);
      add(balanceNumber);

      add(hit);
      add(stand);
      add(doubleDown);

      add(total);
      add(totalNumber);

      add(gains);
      add(gainNumber);

      setPreferredSize(new Dimension(100, 100));
  }
}
