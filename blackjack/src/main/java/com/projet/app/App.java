package com.projet.app;

import com.projet.app.controller.Game;
import com.projet.app.model.*;
import java.util.*;

public class App {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      Game game = new Game();

      game.startGame();

      System.out.println("Player's cards ");
      hand(game.getPlayer().getHand());
      System.out.println("Value of player's card : " + game.getPlayer().calculScore());
      System.out.println("-------------------");
      System.out.println("Dealer's cards");
      hand(game.getDealer().getHand());
      System.out.println("Value of dealer's card : " + game.getDealer().calculScore());

      System.out.println("Hit : 1 or Stand : 2");
      int choice = scanner.nextInt();

      if (choice == 1 ) {
        game.playerHit();
        System.out.println("You hit : " + game.getPlayer().getHand().get(game.getPlayer().getHand().size() -1));
        System.out.println("Player's cards :");
        hand(game.getPlayer().getHand());
        System.out.println("Value of player's card: " + game.getPlayer().calculScore());

      }

    }

    private static void hand(List<Card> hand) {
      for (Card card : hand) {
          System.out.println(card);
      }
  }
}


