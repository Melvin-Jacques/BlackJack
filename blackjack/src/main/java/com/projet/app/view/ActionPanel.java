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

      add(hit);
      add(stand);
      add(doubleDown);

      setPreferredSize(new Dimension(100, 100));
  }
}
