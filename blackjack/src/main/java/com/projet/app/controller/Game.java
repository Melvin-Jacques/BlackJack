package com.projet.app.controller;

import com.projet.app.App;
import com.projet.app.model.Deck;
import com.projet.app.model.Player;

public class Game {
  private Deck deck;
  private Player player;
  private Player dealer;
  private Integer mise;

  public Game() {
    deck = new Deck();
    player = new Player("Player");
    dealer = new Player("Dealer");
  }

  public void startGame() {
    player.setBalance(1000);
    player.addCard(deck.drawCard());
    dealer.addCard(deck.drawCard());
    player.addCard(deck.drawCard());
    dealer.addCard(deck.drawCard());
  }

  public void playerHit() {
    player.addCard(deck.drawCard());
  }

  public void dealerPlay() {
    while (dealer.calculScore() < 17) {
      dealer.addCard(deck.drawCard());
    }
  }

  public String getWinner() {
    if(player.isBust()) {
      return "Dealer win";
    } else if(dealer.isBust()) {
      return "Player win";
    } else if(player.calculScore() > dealer.calculScore()) {
      player.setBalance(player.getBalance() + mise);
      return "Player win";
    } else if (dealer.calculScore() > player.calculScore()) {
      return "Dealer win";
    } else {
      return "Equality";
    }
  }

  public int getTokenLevel() {
    if ( player.calculScore() > dealer.calculScore() ) {
      player.getBalance();
    }
    return getTokenLevel();
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

  public int getMise() {
    return mise;
  }
  public void setMise(Integer mise) {
    player.setBalance(player.getBalance() - mise);
    this.mise = mise;
  }
}
