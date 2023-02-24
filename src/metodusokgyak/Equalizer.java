
package metodusokgyak;

import java.util.Random;

public class Equalizer {    
    
    private static Random rnd = new Random();
    
    
    public static void main(String[] args) {
        TulterhelésesValtozat();
    }
    
    private static void TulterhelésesValtozat() {
        eq();
        eq(8, true);
        eq(12);
        eq(true);
        eq(false);
    }
    
    private static void eq(int db, boolean igaz) {
        //int felso = 7, also = 3;
        String szin = "\u001B[45m";
        for (int i = 0; i < db; i++) {
            System.out.print(szin + "*");
        }

        if (igaz == true) {
            System.out.print(" (" + db + ") ");
        }
        System.out.println("");
    }
    
        private static void eq(int db) {
        eq(db, false);
    }
    /*Túlterhelt metódus: eltér a paraméter szám és / vagy típus*/
    private static void eq() {
        int db = rnd.nextInt(7 - 3 + 1) + 3;
        eq(db);
    }
     
        private static void eq(boolean igaz) {
        int db = rnd.nextInt(7 - 3 +1) + 3;
        eq(db, true);
    }
       
    private static int RandomSzam() {
        int mennyiseg = rnd.nextInt(3, 8);
        return mennyiseg;
    }

}
