package com.projet.app.controller;

import com.projet.app.model.Deck;
import com.projet.app.model.Player;

public class Game {
  private Deck deck;
  private Player player;
  private Player dealer;

  public Game() {
    deck = new Deck();
    player = new Player("Player");
    dealer = new Player("Dealer");
  }

  public void startGame() {
    player.addCard(deck.drawCard());
    dealer.addCard(deck.drawCard());
    player.addCard(deck.drawCard());
    dealer.addCard(deck.drawCard());
  }

  public void playerHit() {
    player.addCard(deck.drawCard());
  }

  public String getWinner() {
    if(player.isBust()) {
      return "Dealer win";
    } else if(dealer.isBust()) {
      return "Player win";
    } else if(player.calculScore() > dealer.calculScore()) {
      return "Player win";
    } else if (dealer.calculScore() > player.calculScore()) {
      return "Dealer win";
    } else {
      return "Equality";
    }
  }

  public Player getPlayer() {
    return player;
  }

  public Player getDealer() {
    return dealer;
  }

  public Deck getDeck() {
    return deck;
  }
}
