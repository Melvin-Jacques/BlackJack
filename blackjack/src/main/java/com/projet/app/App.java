package com.projet.app;

import java.util.List;
import java.util.Scanner;

import com.projet.app.controller.Game;
import com.projet.app.model.*;
import com.projet.app.view.MainFrame;

public class App {


  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Game game = new Game();

    MainFrame app = new MainFrame();
    app.setVisible(true);
    
    game.startGame();

    System.out.println("Player's cards ");
    hand(game.getPlayer().getHand());
    System.out.println("Value of player's card : " + game.getPlayer().calculScore());
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

    System.out.println("Dealer turn : ");
    game.dealerPlay();

    System.out.println("Dealer cards : ");
    hand(game.getDealer().getHand());
    System.out.println("Dealer score " + game.getDealer().calculScore());

    System.out.println("------------------------");
    System.out.println(game.getWinner());
    
  }

  private static void hand(List<Card> hand) {
    for (Card card : hand) {
        System.out.println(card);
    }
  }
}


