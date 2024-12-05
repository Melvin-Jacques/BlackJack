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
