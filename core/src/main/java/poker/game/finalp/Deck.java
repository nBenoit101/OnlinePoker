package poker.game.finalp;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(){
        deck = new ArrayList();

        //Creates a deck of 52 cards
        for(int i=0; i<4; i++){
            String suit = "";
            if(i==0){
                suit = "C";
            }else if(i==1){
                suit = "S";
            }else if(i==2){
                suit = "H";
            }else{
                suit = "D";
            }
            for(int j=1; j<14; j++){
                if(j==1){
                    deck.add(new Card(suit, j,"A"));
                }else if(j<10){
                    deck.add(new Card(suit, j, j+""));
                }else if (j==10){
                    deck.add(new Card(suit, j, 0+""));
                }else if(j==11){
                    deck.add(new Card(suit, j, "J"));
                }else if(j==12){
                    deck.add(new Card(suit, j, "Q"));
                }else{
                    deck.add(new Card(suit, j, "K"));
                }
            }
        }
    }
    public void printDeck(){
        for(int i=0; i<deck.size(); i++) {
            System.out.println(deck.get(i).getValue());
        }
    }

    public void shuffleDeck(){
        //https://www.geeksforgeeks.org/shuffle-or-randomize-a-list-in-java/ line of code from this link
        Collections.shuffle(deck);
    }

    public Card getCard(int i){
        return deck.get(i);
    }

    public static void main(String[] args){
        Deck deck = new Deck();
        deck.printDeck();
    }

}
