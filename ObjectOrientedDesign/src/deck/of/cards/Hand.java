package deck.of.cards;

import deck.of.cards.Card;

import java.util.ArrayList;

public class Hand <T extends Card>{

   ArrayList<T> cards = new ArrayList<T>();

         public int score() {
         int score = 0;
         for (T card : cards) {
             score += card.value();
             }
         return score;
         }

         public void addCard(T card) {
         cards.add(card);
         }
}
