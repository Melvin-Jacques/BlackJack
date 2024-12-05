package com.projet.app;

import com.projet.app.controller.Game;
import com.projet.app.model.*;
import java.util.*;

public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Game game = new Game();

    game.startGame();

    System.out.println( "Voici le montant contenu dans votre portefeuil : " +  game.getPlayer().token(20));

    System.out.println( "Combien misez vous pour commencer ? " );

    int mise = scanner.nextInt();

    while ( mise >  0 ) {

      System.out.println("Player's cards ");
      hand(game.getPlayer().getHand());
      System.out.println("Value of player's card : " + game.getPlayer().calculScore());
      System.out.println("Value of player's token : " + game.getPlayer().token( game.getPlayer().token(20) - mise));
  
      System.out.println("-------------------");
      System.out.println("Dealer's cards");
      hand(game.getDealer().getHand());
      System.out.println("Value of dealer's card : " + game.getDealer().calculScore());
  

      boolean playerTurn = true;

      while (playerTurn) {

        System.out.println("1: Hit, 2: Stand");
        int choice = scanner.nextInt();
  
        if (choice == 1) {
            game.playerHit();
            System.out.println("You hit : " + game.getPlayer().getHand().get(game.getPlayer().getHand().size() - 1));
            System.out.println("Your hand :");
            hand(game.getPlayer().getHand());
            System.out.println("Player score " + game.getPlayer().calculScore());
  
            if (game.getPlayer().isBust()) {
                System.out.println("You have more than 21, you bust");
                return;
            }
        
        } else if (choice == 2){
          playerTurn = false;
        } else {
            System.out.println("Error, choose 1 (Hit) or 2 (Stand).");
        }
      }
  
      System.out.println("------------------------");
      System.out.println(game.getWinner());

    }

  }

    private static void hand(List<Card> hand) {
      for (Card card : hand) {
          System.out.println(card);
      }
  }
}


