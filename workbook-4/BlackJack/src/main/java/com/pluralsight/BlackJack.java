package com.pluralsight;

public class BlackJack {
    public static void main(String[] args) {
        Player player1 = new Player("Devin");
        Player player2 = new Player("Random");
        Deck deck = new Deck();
        deck.shuffle();
        deck.deal();
        Hand playerHand1 = new Hand();
        Hand playerHand2 = new Hand();
        playerHand1.deal(deck.deal());
        playerHand1.deal(deck.deal());
        playerHand2.deal(deck.deal());
        playerHand2.deal(deck.deal());

        System.out.println(player1 +": "+playerHand1.getValue());
        System.out.println(player2 +": " +playerHand2.getValue());




        }



    }

