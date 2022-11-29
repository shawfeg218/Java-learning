//import java.security.SecureRandom;
//
//public class HW2{
//    public static void main(String[] args){
//        DeckOfCards doc = new DeckOfCards();
//        doc.shuffle();
//        for(int i=1; i<=52; i++){
//            System.out.printf("%s, ", doc.dealCard());
//            if(i%4==0){
//                System.out.println();
//            }
//        }
//        System.out.printf("%nNumber of cards with face 6 in the first 20 cards: %d%n", doc.count6());
//    }
//}
//
//class Card{
//    private int face;
//    private String suit;
//    
//    public Card(int cardFace, String cardSuit){
//        this.face = cardFace;
//        this.suit = cardSuit;
//    }
//    public int getFace(){
//        return face;
//    }
//    public String toString(){
//        return face + " " + suit;
//    }
//}
//
//class DeckOfCards{
//    private static final SecureRandom randomNumber = new SecureRandom();
//    private static final int NUMBER_OF_CARDS = 52;
//    private Card[] deck = new Card[NUMBER_OF_CARDS]; //array of Card objects
//    private int currentCard; //indext of next Card to be deal
//    
//    public DeckOfCards(){
//        int[] face = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
//        String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};
//        for(int i=0; i<deck.length; i++){
//            deck[i] = new Card(face[i%13], suit[i/13]);
//        }
//    }
//    public void shuffle(){
//        currentCard = 0;
//        
//        for(int first=0; first<deck.length; first++){
//            int second = randomNumber.nextInt(NUMBER_OF_CARDS);
//            
//            Card temp = deck[first];
//            deck[first] = deck[second];
//            deck[second] = temp; 
//        }
//    }
//    public Card dealCard(){
//        if(currentCard < deck.length){
//            return deck[currentCard++];
//        }else{
//            return null;
//        }
//    }
//    public int count6(){
//        int numberOfSix=0;
//        for(int i=0; i<20; i++){
//            if(deck[i].getFace() == 6){
//                numberOfSix++;
//            }
//        }
//        return numberOfSix;
//    }
//}

import java.security.SecureRandom;

public class HW2{
    public static void main(String[] args){
        DeckOfCard mydeck = new DeckOfCard();
        mydeck.shuffle();
        for(int i=1; i<=52; i++){
            System.out.printf("%-19s", mydeck.dealCard());
            if(i%5 == 0){
                System.out.println();
            }
        }
        System.out.printf("%nThere %d Six in the first 20 cards.", mydeck.CountSix());
    }
}
class Card{
    private final int face;
    private final String suit;
    public Card(int cardFace, String cardSuit){
        this.face = cardFace;
        this.suit = cardSuit;
    }
    public int getFace(){
        return face;
    }
    public String toString(){
        return face + " of " + suit;
    }
}

class DeckOfCard{
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randomNumber = new SecureRandom();
    Card[] deck = new Card[NUMBER_OF_CARDS];
    int currentCard = 0;
    
    public DeckOfCard(){
        int[] face = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        String[] suit = {"Spades", "Clubs", "Hearts", "Diamonds"};
        for(int i=0; i<deck.length; i++){
            deck[i] = new Card(face[i%13], suit[i/13]);
        }
    }
    public void shuffle(){
        currentCard = 0;
        for(int first=0; first<deck.length; first++){
            int second = randomNumber.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    public Card dealCard(){
        if(currentCard < deck.length){
            return deck[currentCard++];
        }else{
            return null;
        }
    }
    public int CountSix(){
        int count=0;
        for(int i=0; i<20; i++){
            if(deck[i].getFace() == 6){
                count++;
            }
        }
        return count;
    }
}