package com.sperry.blackjack.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeckTest {

    @Test
    public void newDeck() {

        Deck deck = new Deck();

        assertEquals(deck.getCards().size(), 52);
        assertEquals(deck.getCards().get(0).getRank(), Rank.TWO);
        assertEquals(deck.getCards().get(51).getRank(), Rank.ACE);
    }
}