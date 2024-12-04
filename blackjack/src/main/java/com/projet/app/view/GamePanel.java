package com.projet.app.view;

import com.projet.app.view.ActionPanel;
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
  
  public GamePanel(CardLayout layout, JPanel mainPanel) {
    ActionPanel actionPanel = new ActionPanel(layout, this, mainPanel);
    
    setLayout(new BorderLayout());

    JPanel game = new JPanel();
    JLabel label = new JLabel("Game Panel");
    game.setLayout(new BoxLayout(game, BoxLayout.Y_AXIS));
    game.add(actionPanel);
    

    add(label, BorderLayout.NORTH);
    add(game, BorderLayout.CENTER);
  }
}
