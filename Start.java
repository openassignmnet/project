package kortspel;
 
public class Start {
 
    public static void main(String[] args){
        DeckOfCards deck = new DeckOfCards();
        BlackjackGUI bjGUI = new BlackjackGUI();
        deck.addCards();
        bjGUI.display();
    }
}