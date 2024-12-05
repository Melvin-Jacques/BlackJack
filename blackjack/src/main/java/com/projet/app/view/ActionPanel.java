package com.projet.app.view;

import javax.swing.*;
import java.awt.*;

public class ActionPanel extends JComponent {
  public ActionPanel(CardLayout layout, GamePanel gamePanel, JPanel mainPanel) {
      //je veux afficher 3 bouton en ligne separé par un petit espace pour ensuite mettre ce panel dans gamepanel
      //avec un flow layout
      setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
      JButton hit = new JButton("Hit");
      JButton stand = new JButton("Stand");
      JButton doubleDown = new JButton("Double");

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
          layout.show(mainPanel, "game");
      });

      JLabel gains = new JLabel("Gains");
      int value = 1000;
      JLabel gainNumber = new JLabel(String.valueOf(value));
      gainNumber.setBackground(Color.darkGray);

      JLabel total = new JLabel("Total");
      JLabel totalNumber = new JLabel(String.valueOf(value));
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
