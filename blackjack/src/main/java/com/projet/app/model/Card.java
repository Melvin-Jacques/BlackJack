package com.projet.app.model;

public class Card {
    private String rank;
    private String suit;
    private int row;
    private int column;

    public Card(String rank, String suit, int row, int column) {
        this.rank = rank;
        this.suit = suit;
        this.row = row;
        this.column = column;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}