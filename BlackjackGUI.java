package kortspelTest1;
 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
 
public class BlackjackGUI extends JPanel {
    DeckOfCards deckOfCards = new DeckOfCards();
    Dealer dealer = new Dealer();
 
     
    int counter = 0;    //counts the amount of cards a player has been given. See buttons for logic.
     
    JPanel topPanel = new JPanel();
    JPanel dealerPanel = new JPanel();
    JPanel playerPanel = new JPanel();
    JTextPane winlosebox = new JTextPane();
    JButton hitButton = new JButton();
    JButton dealButton = new JButton();
    JButton stayButton = new JButton();
    JButton playAgainButton = new JButton();
     
    JLabel dealerLabel = new JLabel();
    JLabel dealerLabel1 = new JLabel();
    JLabel dealerLabel2 = new JLabel();
    JLabel dealerLabel3 = new JLabel();
    JLabel dealerLabel4 = new JLabel();
    JLabel dealerLabel5 = new JLabel();
    JLabel dealerLabel6 = new JLabel();
    JLabel dealerLabel7 = new JLabel();
    JLabel dealerLabel8 = new JLabel();
 
    JLabel playerLabel = new JLabel();
    JLabel playerLabel1 = new JLabel();
    JLabel playerLabel2 = new JLabel();
    JLabel playerLabel3 = new JLabel();
    JLabel playerLabel4 = new JLabel();
    JLabel playerLabel5 = new JLabel();
    JLabel playerLabel6 = new JLabel();
    JLabel playerLabel7 = new JLabel();
    JLabel playerLabel8 = new JLabel();
 
     
//  Player player = new Player();
//  Dealer dealer = new Dealer();
//  Blackjack game = new Blackjack(player, dealer);
     
    /***********
         GUI
     ***********/
    public BlackjackGUI() {
         
        topPanel.setBackground(new Color (0, 122, 0));
        dealerPanel.setBackground(new Color (0, 122, 0));
        playerPanel.setBackground(new Color (0, 122, 0));
         
        winlosebox.setText("      ");
        winlosebox.setFont(new java.awt.Font("Helveteica Bold", 1, 20));
        dealButton.setText(" Deal ");       //Lägg till ActionListener
        dealButton.addActionListener(new dealbutton());
        hitButton.setText(" Hit me! ");         //Lägg till ActionListener
        hitButton.addActionListener(new hitButton());
        hitButton.setEnabled(false);
        stayButton.setText(" Stay ");
        stayButton.addActionListener(new stayButton());
        stayButton.setEnabled(false);
        playAgainButton.setText(" Play again! ");
        playAgainButton.addActionListener(new playAgainButton());
        playAgainButton.setEnabled(false);
         
        dealerLabel.setText(" Dealer: ");
        playerLabel.setText(" Player: ");
         
        dealerLabel1.setPreferredSize(new Dimension (90, 150));
        dealerLabel2.setPreferredSize(new Dimension (90, 150));
        dealerLabel3.setPreferredSize(new Dimension (90, 150));
        dealerLabel4.setPreferredSize(new Dimension (90, 150));
        dealerLabel5.setPreferredSize(new Dimension (90, 150));
        dealerLabel6.setPreferredSize(new Dimension (90, 150));
        dealerLabel7.setPreferredSize(new Dimension (90, 150));
        dealerLabel8.setPreferredSize(new Dimension (90, 150));
         
        playerLabel1.setPreferredSize(new Dimension (90, 150));
        playerLabel2.setPreferredSize(new Dimension (90, 150));
        playerLabel3.setPreferredSize(new Dimension (90, 150));
        playerLabel4.setPreferredSize(new Dimension (90, 150));
        playerLabel5.setPreferredSize(new Dimension (90, 150));
        playerLabel6.setPreferredSize(new Dimension (90, 150));
        playerLabel7.setPreferredSize(new Dimension (90, 150));
        playerLabel8.setPreferredSize(new Dimension (90, 150));
         
        topPanel.add(winlosebox);
        topPanel.add(dealButton);
        topPanel.add(hitButton);
        topPanel.add(stayButton);
        topPanel.add(playAgainButton);
         
        //ADDS CARD-SPACE TO BOARD
        playerPanel.add(playerLabel);
        playerPanel.add(playerLabel1);
        playerPanel.add(playerLabel2);
        playerPanel.add(playerLabel3);
        playerPanel.add(playerLabel4);
        playerPanel.add(playerLabel5);
        playerPanel.add(playerLabel6);
        playerPanel.add(playerLabel7);
        playerPanel.add(playerLabel8);
         
        dealerPanel.add(dealerLabel);
        dealerPanel.add(dealerLabel1);
        dealerPanel.add(dealerLabel2);
        dealerPanel.add(dealerLabel3);
        dealerPanel.add(dealerLabel3);
        dealerPanel.add(dealerLabel5);
        dealerPanel.add(dealerLabel6);
        dealerPanel.add(dealerLabel7);
        dealerPanel.add(dealerLabel8);
         
        setLayout(new BorderLayout());
        add(topPanel,BorderLayout.NORTH);
        add(dealerPanel,BorderLayout.CENTER);
        add(playerPanel,BorderLayout.SOUTH);
    }
     
     
    public void display(){
        JFrame myFrame = new JFrame("Blackjack");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setContentPane(this);
        myFrame.setPreferredSize(new Dimension(700,500));
 
        //The window
        myFrame.pack();
        myFrame.setVisible(true);
    }
     
    /*************
        BUTTONS
     *************/
     
    private class dealbutton implements ActionListener {
        public void actionPerformed(ActionEvent e) {    
            dealerLabel1.setIcon(DeckOfCards.showCard());
            dealerLabel2.setIcon(DeckOfCards.showCard());
             
            playerLabel1.setIcon(DeckOfCards.showCard());
            playerLabel2.setIcon(DeckOfCards.showCard());
 
            dealButton.setEnabled(false);
            playAgainButton.setEnabled(true);
            hitButton.setEnabled(true);
            stayButton.setEnabled(true);
        }
    }
     
    private class hitButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == hitButton){
                counter++;
            }
                if(counter == 1){
                    playerLabel3.setIcon(DeckOfCards.showCard());
                }
                if(counter == 2){
                    playerLabel4.setIcon(DeckOfCards.showCard());
                }
                if(counter == 3){
                    playerLabel5.setIcon(DeckOfCards.showCard());
                }
                if(counter == 4){
                    playerLabel6.setIcon(DeckOfCards.showCard());
                }
                if(counter == 5){
                    playerLabel7.setIcon(DeckOfCards.showCard());
                }
                if(counter == 6){
                    playerLabel8.setIcon(DeckOfCards.showCard());
                }
        }
    }
     
    private class stayButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            hitButton.setEnabled(false);    
        }
    }
     
    private class playAgainButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dealButton.setEnabled(true);
            hitButton.setEnabled(false);
            stayButton.setEnabled(false);
            playAgainButton.setEnabled(false);
             
            playerLabel1.setIcon(null);
            playerLabel2.setIcon(null);
            playerLabel3.setIcon(null);
            playerLabel4.setIcon(null);
            playerLabel5.setIcon(null);
            playerLabel6.setIcon(null);
            playerLabel7.setIcon(null);
            playerLabel8.setIcon(null);
             
            dealerLabel1.setIcon(null);
            dealerLabel2.setIcon(null);
            dealerLabel3.setIcon(null);
            dealerLabel4.setIcon(null);
            dealerLabel5.setIcon(null);
            dealerLabel6.setIcon(null);
            dealerLabel7.setIcon(null);
            dealerLabel8.setIcon(null);
             
            counter = 0;    //resets the counted amount of cards a player has been given to zero.
        }   
    }
}
