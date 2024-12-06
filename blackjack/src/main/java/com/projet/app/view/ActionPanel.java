package com.projet.app.view;

import javax.swing.*;

import com.projet.app.App;
import com.projet.app.controller.Game;
import com.projet.app.model.Player;

import java.awt.*;

public class ActionPanel extends JComponent {

  public ActionPanel(CardLayout layout, GamePanel gamePanel, JPanel mainPanel) {
      setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
      JButton hit = new JButton("Hit");
      JButton stand = new JButton("Stand");
      JButton doubleDown = new JButton("Double");

      Game gameMise = new Game();

      hit.addActionListener(e -> {
          //gamePanel.hit();
          layout.show(mainPanel, "game");
      });
      
      stand.addActionListener(e -> {
          //gamePanel.stand();
          layout.show(mainPanel, "game");
      });

      doubleDown.addActionListener(e -> {
          //gamePanel.doubleDown();
          System.out.println( gameMise.getMise() * 2);
          layout.show(mainPanel, "game");
      });

      JLabel gains = new JLabel("Gain");
      int value = 1000;
      JLabel gainNumber = new JLabel(String.valueOf(value));
      gainNumber.setBackground(Color.darkGray);

      JLabel total = new JLabel("Mise");
      JLabel totalNumber = new JLabel(String.valueOf(value));
      totalNumber.setBackground(Color.darkGray);

      JLabel balance = new JLabel("Balance");
      JLabel balanceNumber = new JLabel(String.valueOf(value));

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