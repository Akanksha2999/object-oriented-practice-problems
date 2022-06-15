package com.bridgelabz;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King", "Ace"};

        int n = suit.length * rank.length;
        String[] deck = new String[n];

        //Initialize the deck
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deck[suit.length * i + j] = rank[i] + " of " + suit[j];
            }
        }

        // shuffle the deck
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // print the shuffled cards to 4 people each of 9 cards
        for (int i = 0; i < 4; i++) {
            System.out.println(" ");
            System.out.println("Person:" + (i + 1) + "");
            System.out.println(" ");
            for (int j = 0; j < 9; j++) {
                System.out.println(deck[i + j * 4] + " (Card" + (i + j * 4) + ") ");
            }//End of this for loop
        }//End of this for loop

    }//End of main
}//End of class
