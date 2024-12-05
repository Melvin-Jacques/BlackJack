package com.projet.app.view;

import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImageTest extends JPanel {
  private BufferedImage image;
  private BufferedImage cards;

  public ImageTest(int column, int row) {
    try {
      InputStream fichierImage = getClass().getResourceAsStream("../ressources/images/cards.jpg");
      if (fichierImage == null) {
        throw new Exception("Image non trouvée");
      }
      image = ImageIO.read(fichierImage);

      int largeurCarte = 62;
      int hauteurCarte = 92;
      
      cards = image.getSubimage(column * (largeurCarte + 7) + 18,
          row * (hauteurCarte + 6) + 17,
          largeurCarte, hauteurCarte);

    } catch (Exception err) {
      System.out.println(err.getMessage());
    }
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (cards != null) {
      g.drawImage(cards, 62, 92, null);
    }
  }
}