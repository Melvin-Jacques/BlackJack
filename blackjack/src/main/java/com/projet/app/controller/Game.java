package com.projet.app.controller;

import java.util.ArrayList;
import java.util.List;

public class Game {
  private List<String> deck;
  private List<String> playerHand;
  private List<String> dealerHand;

  public Game() {
    deck = new ArrayList<>();
    playerHand = new ArrayList<>();
    dealerHand = new ArrayList<>();

  }

  private void initializeDeck() {
    String[] colors = {"Hearts", "Diamonds", "Clubs", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    for (String color : colors) {
      for (String rank : ranks) {
        deck.add(rank + "of" + color);
      }
    }

    
  }

  public String drawCard() {
    return deck.isEmpty() ? null : deck.remove(0);
  }

  public void dealCard() {
    playerHand.add(drawCard());
    dealerHand.add(drawCard());
    playerHand.add(drawCard());
    dealerHand.add(drawCard());
  }

  public List<String> getPlayerHand() {
    return playerHand;
  }

  public List<String> getDealerHand() {
    return dealerHand;
  }

  public int calculScore(List<String> hand) {
    int score = 0;
  }
}
