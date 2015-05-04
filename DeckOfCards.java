package kortspel;
 
import java.util.ArrayList;
import java.util.Random;
 
import javax.swing.ImageIcon;
 
public class DeckOfCards {
    private static Random rand = new Random();
    private static Dealer dealer = new Dealer();
    private static int randomNum;
 
    private static ArrayList<ImageIcon> Cards = new ArrayList<ImageIcon>(); 
     
    private static ImageIcon klöverTvå = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/2_of_clubs.jpg");
    private static ImageIcon klöverTre = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/3_of_clubs.jpg");
    private static ImageIcon klöverFyra = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/4_of_clubs.jpg");
    private static ImageIcon klöverFem = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/5_of_clubs.jpg");
    private static ImageIcon klöverSex = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/6_of_clubs.jpg");
    private static ImageIcon klöverSju = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/7_of_clubs.jpg");
    private static ImageIcon klöverÅtta = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/8_of_clubs.jpg");
    private static ImageIcon klöverNio = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/9_of_clubs.jpg");
    private static ImageIcon klöverTio = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/10_of_clubs.jpg");
    private static ImageIcon klöverKnäckt = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/jack_of_clubs2.jpg");
    private static ImageIcon klöverDam = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/queen_of_clubs2.jpg");
    private static ImageIcon klöverKung = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/king_of_clubs2.jpg");
    private static ImageIcon klöverEss = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/ace_of_clubs.jpg");
 
    private static ImageIcon ruterTvå = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/2_of_diamonds.jpg");
    private static ImageIcon ruterTre = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/3_of_diamonds.jpg");
    private static ImageIcon ruterFyra = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/4_of_diamonds.jpg");
    private static ImageIcon ruterFem = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/5_of_diamonds.jpg");
    private static ImageIcon ruterSex = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/6_of_diamonds.jpg");
    private static ImageIcon ruterSju = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/7_of_diamonds.jpg");
    private static ImageIcon ruterÅtta = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/8_of_diamonds.jpg");
    private static ImageIcon ruterNio = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/9_of_diamonds.jpg");
    private static ImageIcon ruterTio = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/10_of_diamonds.jpg");
    private static ImageIcon ruterKnäckt = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/jack_of_diamonds2.jpg");
    private static ImageIcon ruterDam = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/dam_of_diamonds2.jpg");
    private static ImageIcon ruterKung = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/kung_of_diamonds2.jpg");
    private static ImageIcon ruterEss = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/ace_of_diamonds.jpg");
 
    private static ImageIcon spaderTvå = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/2_of_spades.jpg");
    private static ImageIcon spaderTre = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/3_of_spades.jpg");
    private static ImageIcon spaderFyra = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/4_of_spades.jpg");
    private static ImageIcon spaderFem = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/5_of_spades.jpg");
    private static ImageIcon spaderSex = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/6_of_spades.jpg");
    private static ImageIcon spaderSju = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/7_of_spades.jpg");
    private static ImageIcon spaderÅtta = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/8_of_spades.jpg");
    private static ImageIcon spaderNio = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/9_of_spades.jpg");
    private static ImageIcon spaderTio = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/10_of_spades.jpg");
    private static ImageIcon spaderKnäckt = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/queen_of_spades2.jpg");
    private static ImageIcon spaderDam = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/king_of_spades2.jpg");
    private static ImageIcon spaderKung = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/ace_of_spades.jpg");
    private static ImageIcon spaderEss = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/ace_of_spades.jpg");
     
    private static ImageIcon hjärterTvå = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/2_of_hearts.jpg");
    private static ImageIcon hjärterTre = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/3_of_hearts.jpg");
    private static ImageIcon hjärterFyra = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/4_of_hearts.jpg");
    private static ImageIcon hjärterFem = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/5_of_hearts.jpg");
    private static ImageIcon hjärterSex = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/6_of_hearts.jpg");
    private static ImageIcon hjärterSju = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/7_of_hearts.jpg");
    private static ImageIcon hjärterÅtta = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/8_of_hearts.jpg");
    private static ImageIcon hjärterNio = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/9_of_hearts.jpg");
    private static ImageIcon hjärterTio = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/10_of_hearts.jpg");
    private static ImageIcon hjärterKnäckt = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/jack_of_hearts2.jpg");
    private static ImageIcon hjärterDam = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/queen_of_hearts2.jpg");
    private static ImageIcon hjärterKung = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/king_of_hearts2.jpg");
    private static ImageIcon hjärterEss = new ImageIcon ("Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/ace_of_hearts.jpg");
 
    public void addCards(){
        Cards.add(klöverTvå);
        Cards.add(klöverTre);
        Cards.add(klöverFyra);
        Cards.add(klöverFem);
        Cards.add(klöverSex);
        Cards.add(klöverSju);
        Cards.add(klöverÅtta);
        Cards.add(klöverNio);
        Cards.add(klöverTio);
        Cards.add(klöverKnäckt);
        Cards.add(klöverDam);
        Cards.add(klöverKung);
        Cards.add(klöverEss);
 
        Cards.add (ruterTvå);
        Cards.add (ruterTre);
        Cards.add (ruterFyra);
        Cards.add (ruterFem);
        Cards.add (ruterSex);
        Cards.add (ruterSju);
        Cards.add (ruterÅtta);
        Cards.add (ruterNio);
        Cards.add (ruterTio);
        Cards.add (ruterKnäckt);
        Cards.add (ruterDam);
        Cards.add (ruterKung);
        Cards.add (ruterEss);
 
        Cards.add (spaderTvå);
        Cards.add (spaderTre);
        Cards.add (spaderFyra);
        Cards.add (spaderFem);
        Cards.add (spaderSex);
        Cards.add (spaderSju);
        Cards.add (spaderÅtta);
        Cards.add (spaderNio);
        Cards.add (spaderTio);
        Cards.add (spaderKnäckt);
        Cards.add (spaderDam);
        Cards.add (spaderKung);
        Cards.add (spaderEss);
 
        Cards.add(hjärterTvå);
        Cards.add(hjärterTre);
        Cards.add(hjärterFyra);
        Cards.add(hjärterFem);
        Cards.add(hjärterSex);
        Cards.add(hjärterSju);
        Cards.add(hjärterÅtta);
        Cards.add(hjärterNio);
        Cards.add(hjärterNio);
        Cards.add(hjärterTio);
        Cards.add(hjärterKnäckt);
        Cards.add(hjärterDam);
        Cards.add(hjärterKung);
        Cards.add(hjärterEss);
    }
 
    private static ImageIcon temporaryImage = new ImageIcon();
 
    public static ImageIcon showCard(){
         
        //randomNum = rand.nextInt((54 - 0) + 1) + 0;
         
           int size = 51;
 
            ArrayList<Integer> list = new ArrayList<Integer>(size);
            for(int i = 1; i <= size; i++) {
                list.add(i);
            }
 
            Random rand = new Random();
            while(list.size() > 0) {
                int index = rand.nextInt(list.size());
                System.out.println("Selected: "+list.remove(index));
         
  
        for(int i = 0; i<Cards.size(); i++){
            if(i == rand){
                temporaryImage = new ImageIcon(Cards.get(i).getImage().getScaledInstance(75, 150, i));
                 
                 
            }
        }
 
        System.out.println("Kortleken innehåller " + Cards.size() + " antal kort");
 
        if(Cards.isEmpty()){
            System.out.println("Kortleken är slut");
        }
        return temporaryImage;
    }
    }
}