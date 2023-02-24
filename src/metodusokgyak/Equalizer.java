package metodusokgyak;

import java.util.Random;

public class Equalizer {
    
    private static Random rnd = new Random();
    
    public static void main(String[] args) {
        //SzinesMintak();
        TulterhelésesValtozat();
        
    }

    private static void SzinesMintak() {
        int szam = RandomSzam();
        eq(szam);
        eq(12);//12
        szam = RandomSzam();
        eq(szam);
        eq(8);//8
        szam = RandomSzam();
        eq(szam);
    }
    
    private static void TulterhelésesValtozat() {
        eq();
        eq(12);
        eq();
        eq(8);
        eq();
        
    }

    private static void eq(int a) {
        //int felso = 7, also = 3;
        String szin = "\u001B[45m";        
       
        for (int i = 0; i < a; i++) {
            System.out.print(szin + "*");            
        }
        System.out.println("");           
    }  
    
    /*Túlterhelt metódus: eltér a paraméter szám és / vagy típus*/
    private static void eq() {
        int db = rnd.nextInt(3, 8);
        eq(db);        
    }   
    
    private static int RandomSzam() {
        int mennyiseg = rnd.nextInt(3, 8);
        return mennyiseg;
    }

    
}
