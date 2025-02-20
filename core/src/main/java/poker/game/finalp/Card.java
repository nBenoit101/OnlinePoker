package poker.game.finalp;

public class Card {
    private String suit;
    private int value;
    private String strVal;

    public Card(String suit, int value, String strVal){
        this.suit = suit;
        this.strVal = strVal;
        this.value = value;

    }

    public String getSuit(){
        return suit;
    }

    public int getValue(){
        return value;
    }

    public String getStrVal(){
        return strVal;
    }


    @Override
    public String toString(){
        return strVal + "" + suit;
    }
}
