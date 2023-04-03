//public class Card{
//    private final String face;
//    private final String suit;
//    public Card(String cardFace, String cardSuit){
//        this.face = cardFace;
//        this.suit = cardSuit;
//    }
//    public String toString(){
//        return face + " of " + suit;
//    }
//}

public class Card{
    private int face;
    private String suit;

    public Card(int face, String suit) {
        this.face = face;
        this.suit = suit;
    }
    
    public int getFace() {
        return face;
    }
    
    public String toString(){
        return face + " of " + suit;
    }
}

