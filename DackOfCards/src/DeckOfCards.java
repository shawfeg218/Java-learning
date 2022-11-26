import java.security.SecureRandom;
public class DeckOfCards{
    private static final SecureRandom randomNumber = new SecureRandom();
    private static final int NUMBER_OF_CARDS = 52;
    Card[] deck = new Card[NUMBER_OF_CARDS];
    private int currentCard = 0;
    
    public DeckOfCards(){
        String[] face = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};
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
        if(currentCard<deck.length){
            return deck[currentCard++];
        }else{
            return null;
        }
    }
}