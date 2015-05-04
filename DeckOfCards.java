package kortspel;
 
import java.util.ArrayList;
import java.util.Random;
 
import javax.swing.ImageIcon;
 
public class DeckOfCards {
    private static Random rand = new Random();
    private static Dealer dealer = new Dealer();
    private static int randomNum;
 
    private static ArrayList<ImageIcon> Cards = new ArrayList<ImageIcon>(); 
     
    private static ImageIcon kl�verTv� = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/2_of_clubs.jpg");
    private static ImageIcon kl�verTre = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/3_of_clubs.jpg");
    private static ImageIcon kl�verFyra = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/4_of_clubs.jpg");
    private static ImageIcon kl�verFem = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/5_of_clubs.jpg");
    private static ImageIcon kl�verSex = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/6_of_clubs.jpg");
    private static ImageIcon kl�verSju = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/7_of_clubs.jpg");
    private static ImageIcon kl�ver�tta = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/8_of_clubs.jpg");
    private static ImageIcon kl�verNio = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/9_of_clubs.jpg");
    private static ImageIcon kl�verTio = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/10_of_clubs.jpg");
    private static ImageIcon kl�verKn�ckt = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/jack_of_clubs2.jpg");
    private static ImageIcon kl�verDam = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/queen_of_clubs2.jpg");
    private static ImageIcon kl�verKung = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/king_of_clubs2.jpg");
    private static ImageIcon kl�verEss = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/ace_of_clubs.jpg");
 
    private static ImageIcon ruterTv� = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/2_of_diamonds.jpg");
    private static ImageIcon ruterTre = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/3_of_diamonds.jpg");
    private static ImageIcon ruterFyra = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/4_of_diamonds.jpg");
    private static ImageIcon ruterFem = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/5_of_diamonds.jpg");
    private static ImageIcon ruterSex = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/6_of_diamonds.jpg");
    private static ImageIcon ruterSju = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/7_of_diamonds.jpg");
    private static ImageIcon ruter�tta = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/8_of_diamonds.jpg");
    private static ImageIcon ruterNio = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/9_of_diamonds.jpg");
    private static ImageIcon ruterTio = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/10_of_diamonds.jpg");
    private static ImageIcon ruterKn�ckt = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/jack_of_diamonds2.jpg");
    private static ImageIcon ruterDam = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/dam_of_diamonds2.jpg");
    private static ImageIcon ruterKung = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/kung_of_diamonds2.jpg");
    private static ImageIcon ruterEss = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/ace_of_diamonds.jpg");
 
    private static ImageIcon spaderTv� = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/2_of_spades.jpg");
    private static ImageIcon spaderTre = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/3_of_spades.jpg");
    private static ImageIcon spaderFyra = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/4_of_spades.jpg");
    private static ImageIcon spaderFem = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/5_of_spades.jpg");
    private static ImageIcon spaderSex = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/6_of_spades.jpg");
    private static ImageIcon spaderSju = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/7_of_spades.jpg");
    private static ImageIcon spader�tta = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/8_of_spades.jpg");
    private static ImageIcon spaderNio = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/9_of_spades.jpg");
    private static ImageIcon spaderTio = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/10_of_spades.jpg");
    private static ImageIcon spaderKn�ckt = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/queen_of_spades2.jpg");
    private static ImageIcon spaderDam = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/king_of_spades2.jpg");
    private static ImageIcon spaderKung = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/ace_of_spades.jpg");
    private static ImageIcon spaderEss = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/ace_of_spades.jpg");
     
    private static ImageIcon hj�rterTv� = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/2_of_hearts.jpg");
    private static ImageIcon hj�rterTre = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/3_of_hearts.jpg");
    private static ImageIcon hj�rterFyra = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/4_of_hearts.jpg");
    private static ImageIcon hj�rterFem = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/5_of_hearts.jpg");
    private static ImageIcon hj�rterSex = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/6_of_hearts.jpg");
    private static ImageIcon hj�rterSju = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/7_of_hearts.jpg");
    private static ImageIcon hj�rter�tta = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/8_of_hearts.jpg");
    private static ImageIcon hj�rterNio = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/9_of_hearts.jpg");
    private static ImageIcon hj�rterTio = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/10_of_hearts.jpg");
    private static ImageIcon hj�rterKn�ckt = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/jack_of_hearts2.jpg");
    private static ImageIcon hj�rterDam = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/queen_of_hearts2.jpg");
    private static ImageIcon hj�rterKung = new ImageIcon ("/Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/king_of_hearts2.jpg");
    private static ImageIcon hj�rterEss = new ImageIcon ("Users/Cklintenberg/Documents/workspace/SYS_VT_2015/kortlek/ace_of_hearts.jpg");
 
    public void addCards(){
        Cards.add(kl�verTv�);
        Cards.add(kl�verTre);
        Cards.add(kl�verFyra);
        Cards.add(kl�verFem);
        Cards.add(kl�verSex);
        Cards.add(kl�verSju);
        Cards.add(kl�ver�tta);
        Cards.add(kl�verNio);
        Cards.add(kl�verTio);
        Cards.add(kl�verKn�ckt);
        Cards.add(kl�verDam);
        Cards.add(kl�verKung);
        Cards.add(kl�verEss);
 
        Cards.add (ruterTv�);
        Cards.add (ruterTre);
        Cards.add (ruterFyra);
        Cards.add (ruterFem);
        Cards.add (ruterSex);
        Cards.add (ruterSju);
        Cards.add (ruter�tta);
        Cards.add (ruterNio);
        Cards.add (ruterTio);
        Cards.add (ruterKn�ckt);
        Cards.add (ruterDam);
        Cards.add (ruterKung);
        Cards.add (ruterEss);
 
        Cards.add (spaderTv�);
        Cards.add (spaderTre);
        Cards.add (spaderFyra);
        Cards.add (spaderFem);
        Cards.add (spaderSex);
        Cards.add (spaderSju);
        Cards.add (spader�tta);
        Cards.add (spaderNio);
        Cards.add (spaderTio);
        Cards.add (spaderKn�ckt);
        Cards.add (spaderDam);
        Cards.add (spaderKung);
        Cards.add (spaderEss);
 
        Cards.add(hj�rterTv�);
        Cards.add(hj�rterTre);
        Cards.add(hj�rterFyra);
        Cards.add(hj�rterFem);
        Cards.add(hj�rterSex);
        Cards.add(hj�rterSju);
        Cards.add(hj�rter�tta);
        Cards.add(hj�rterNio);
        Cards.add(hj�rterNio);
        Cards.add(hj�rterTio);
        Cards.add(hj�rterKn�ckt);
        Cards.add(hj�rterDam);
        Cards.add(hj�rterKung);
        Cards.add(hj�rterEss);
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
 
        System.out.println("Kortleken inneh�ller " + Cards.size() + " antal kort");
 
        if(Cards.isEmpty()){
            System.out.println("Kortleken �r slut");
        }
        return temporaryImage;
    }
    }
}