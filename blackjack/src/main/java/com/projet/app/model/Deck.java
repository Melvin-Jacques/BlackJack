package com.projet.app.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
      String[] colors = {"Clubs", "Spades", "Hearts", "Diamonds"};
      String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
  
      for( int row = 0; row < colors.length; row++) {
        for (int column = 0; column < ranks.length; column++) {
          cards.add(new Card(ranks[column], colors[row], row, column + 1));
        }
      }
      shuffle();
    }

    public void shuffle() {
      Collections.shuffle(cards);
    }

    public Card drawCard() {
      return cards.isEmpty() ? null : cards.remove(0);
    }
}