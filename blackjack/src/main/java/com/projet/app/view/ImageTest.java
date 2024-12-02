package com.projet.app.view;

import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImageTest extends JPanel {
  private BufferedImage image;
  private BufferedImage carte;

  public ImageTest() {
    try {
      InputStream fichierImage = getClass().getResourceAsStream("../ressources/images/cards.jpg");
      if (fichierImage == null) {
        throw new Exception("Image non trouvée");
      }
      image = ImageIO.read(fichierImage);

      int largeurCarte = 62;
      int hauteurCarte = 92;
      int ligne = 3;
      int colonne = 0;
      carte = image.getSubimage(colonne * (largeurCarte + 7) + 18,
          ligne * (hauteurCarte + 6) + 17,
          largeurCarte, hauteurCarte);

    } catch (Exception err) {
      System.out.println(err.getMessage());
    }
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (carte != null) {
      g.drawImage(carte, 50, 50, null);
    }
  }

  public static void main(String[] args) {
    JFrame f = new JFrame("Carte à jouer");
    ImageTest panelImage = new ImageTest();
    f.add(panelImage);
    f.setSize(200, 300);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}
