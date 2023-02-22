package metodusokgyak;

public class MetodusokGyak {

    public static void main(String[] args) {
        elso10SzamOsszege();
        String szoveg = "Az első 10 szám összege %d\\n\",osszeg";
        kiir(szoveg);
        osszead(2, 3);
        szoveg = "%d + %d = %d";
        kiir(szoveg);
    }
    
    private static int elso10SzamOsszege(){
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;        
    }

//    private static void eredmenyKiiras(int osszeg) {
//        System.out.printf("Az első 10 szám összege %d\n",osszeg);
//    }

    private static int osszead(int a, int b) {        
        return a + b;
    }
    
    private static void kiir(String szoveg) {
        System.out.printf(szoveg);
    }
}
