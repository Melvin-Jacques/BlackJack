package com.projet.app.view;

import com.projet.app.view.ActionPanel;
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
  
  public GamePanel(CardLayout layout, JPanel mainPanel) {
    ActionPanel actionPanel = new ActionPanel(layout, this, mainPanel);
    ImageTest cardImage = new ImageTest(0, 0);
    cardImage.setBackground(Color.BLACK);
    
    setLayout(new BorderLayout());

    JLabel label = new JLabel("Game Panel");

    add(cardImage, BorderLayout.CENTER);
    add(cardImage);
    add(label, BorderLayout.NORTH);
    add(actionPanel, BorderLayout.SOUTH);
  }
}
