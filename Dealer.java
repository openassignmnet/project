package kortspel;
 
import java.util.ArrayList;
 
import javax.swing.ImageIcon;
 
public class Dealer {
     
    private DeckOfCards deckOfCards = new DeckOfCards();
    private ImageIcon usedCards = new ImageIcon();
    private ArrayList<ImageIcon> stackOfUsedCards = new ArrayList<ImageIcon>();
     
 
    public void usedCards (ImageIcon cards){
        usedCards = cards;
        stackOfUsedCards.add(usedCards);
         
        for(int i = 0; i< stackOfUsedCards.size(); i++){
            if(stackOfUsedCards.contains(null)){
                System.out.println("Spelet har b�rjat!");
            }
            if(stackOfUsedCards.contains(DeckOfCards.showCard())){
                System.out.println("kortet har visats minst tv� g�nger!");
            }
        }
    }
}