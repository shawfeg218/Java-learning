//public class DeckOfCardsTest{
//    public static void main(String[] args){
//        DeckOfCards myDeckOfCards = new DeckOfCards();
//        myDeckOfCards.shuffle();
//        for(int i=1; i<=52; i++){
//            System.out.printf("%-19s|\t", myDeckOfCards.dealCard());
//            if(i%4 == 0){
//                System.out.println();
//            }
//        }
//    }
//}


public class DeckOfCardsTest{
    public static void main(String[] args){
        DeckOfCards mydeck = new DeckOfCards();
        mydeck.shuffle();
        for(int i=1; i<=52; i++){
            System.out.printf("%-19s|\t", mydeck.dealCard());
            if(i%4 == 0){
                System.out.println();
            }
        }
        System.out.printf("There are %d cards face 6", mydeck.countSix());
    }
}