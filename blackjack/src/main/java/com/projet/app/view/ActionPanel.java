package com.projet.app.view;

import javax.swing.*;
import java.awt.*;

public class ActionPanel extends JPanel {
  public ActionPanel(CardLayout layout, GamePanel gamePanel, JPanel mainPanel) {
    JFrame frame = new JFrame();
    Dimension buttonSize = new Dimension(100, 25);
    
    JButton btn1 = new JButton("Hit");
    JButton btn2 = new JButton("Stand");
    JButton btn3 = new JButton("Double Down");
        
    frame.add(btn1);
    frame.add(btn2);
    frame.add(btn3);

    frame.setLayout(new FlowLayout(FlowLayout.CENTER));
    
    btn1.setPreferredSize(buttonSize);
    btn2.setPreferredSize(buttonSize);
    btn3.setPreferredSize(buttonSize);
    frame.setSize(300,300);
    frame.setVisible(true);
  }
}
