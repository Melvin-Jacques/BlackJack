package com.projet.app.view;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;


public class HomePanel extends JPanel {
  public HomePanel(CardLayout layout, JPanel mainPanel) {
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    JPanel home = new JPanel();
    home.setLayout(new BoxLayout(home, BoxLayout.Y_AXIS));

    JButton gameButton = new JButton("Jouer");
    gameButton.addActionListener(e -> layout.show(mainPanel, "bet"));

    gameButton.setAlignmentX(CENTER_ALIGNMENT);

    Dimension buttonSize = new Dimension(200, 50);
    gameButton.setPreferredSize(buttonSize);
    gameButton.setMaximumSize(buttonSize);
    gameButton.setMinimumSize(buttonSize);

    
    JLabel title = new JLabel("MelvinBlack");
    title.setFont(new Font("Arial", Font.BOLD, 30));
    title.setHorizontalAlignment(SwingConstants.CENTER);
    title.setAlignmentX(CENTER_ALIGNMENT);
    title.setBackground(new Color(179, 179, 204));
    title.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    title.setOpaque(true);
    title.setMaximumSize(new Dimension(Integer.MAX_VALUE, 0));

    this.add(title);
    home.add(gameButton);

    this.add(Box.createVerticalGlue());
    this.add(home);
    this.add(Box.createVerticalGlue());

  }

}
