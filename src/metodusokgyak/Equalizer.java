package metodusokgyak;

import java.util.Random;

public class Equalizer {
    
    private static Random rnd = new Random();
    
    public static void main(String[] args) {
        SzinesMintak();
    }

    private static void SzinesMintak() {
        eq();
        eq();
        eq();
        eq();
        eq();
    }

    private static void eq() {
        //int felso = 7, also = 3;
        String szin = "\u001B[45m";
        
        int mennyiseg = rnd.nextInt(3, 8);
        for (int i = 0; i < mennyiseg; i++) {
            System.out.print(szin + "*");
            
        }
        System.out.println("");
        
        
    }
}
