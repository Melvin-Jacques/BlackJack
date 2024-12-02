package com.projet.app.view;

import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;

public class ImageTest extends JPanel {
  private BufferedImage image;
  private BufferedImage carte;

  public ImageTest() {
    try {
      InputStream fichierImage = getClass().getResourceAsStream("/images/carte.png");
      if (fichierImage == null) {
        throw new Exception("Image non trouvée");
      }
      image = ImageIO.read(fichierImage);

      int largeurCarte = 95;
      int hauteurCarte = 135;
      int ligne = 6;
      int colonne = 3;
      carte = image.getSubimage(colonne * (largeurCarte + 34) + 35,
          ligne * (hauteurCarte + 35) + 35,
          largeurCarte, hauteurCarte);

    } catch (Exception err) {
      System.out.println(err.getMessage());
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
