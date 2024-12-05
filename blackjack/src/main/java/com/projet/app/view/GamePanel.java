package com.projet.app.view;

import com.projet.app.view.ActionPanel;
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
  
  public GamePanel(CardLayout layout, JPanel mainPanel) {
    int col = 0;
    int row = 0;
    ActionPanel actionPanel = new ActionPanel(layout, this, mainPanel);
    ImageTest cardImage = new ImageTest(col, row);
    setLayout(new BorderLayout());

    JPanel cards = new JPanel();
    cards.setLayout(new BoxLayout(cards, BoxLayout.X_AXIS));
    cards.setBackground(Color.RED);

    ImageTest cardImage2 = new ImageTest(1, row);
    ImageTest cardImage3 = new ImageTest(2, row);
    cardImage.setBackground(Color.ORANGE);

    // JLabel label = new JLabel("Game Panel");

    cards.add(cardImage);
    cards.add(cardImage2);
    cards.add(cardImage3);
    add(cards, BorderLayout.CENTER);
    // add(label, BorderLayout.NORTH);
    add(actionPanel, BorderLayout.SOUTH);
  }
}
