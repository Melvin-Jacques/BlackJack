package com.projet.app.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
      this.name = name;
      this.hand = new ArrayList<>();
    }

    public void addCard(Card card) {
      hand.add(card); 
    }

    public List<Card> getHand() {
      return hand;
    }

    public int token(int protefeuilIntitial) {
      int protefeuilFinal = 0;
 
      if ( protefeuilIntitial < protefeuilFinal) {
        protefeuilIntitial = protefeuilFinal - protefeuilIntitial;
      }
      else {
        protefeuilIntitial = protefeuilFinal + protefeuilIntitial;
      }
      return protefeuilIntitial;
    }

    public int calculScore() {
      int score = 0;
      int ace = 0;

      for( Card card : hand) {
        String rank = card.getRank();
        switch (rank) {
          case "Jack":
          case "Queen":
          case "King":
          score += 10;
          break;
          case "Ace":
          score +=11;
          break;

          default:
            score += Integer.parseInt(rank);
        }
      }
      while (score > 21 && ace > 0) {
        score -= 10;
        ace--;
      }

      return score;     
    }

    public boolean isBust() {
      return calculScore() > 21;
    }

    public boolean isNotBust() {
      return calculScore() > 0 || calculScore() < 21;
    }
  
}
