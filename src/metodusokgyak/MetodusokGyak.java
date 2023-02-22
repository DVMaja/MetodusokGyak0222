package metodusokgyak;

public class MetodusokGyak {

    public static void main(String[] args) {
        int osszeg = elso10SzamOsszege();
        String szoveg = "Az első 10 szám összege" + osszeg;
        kiir(szoveg);
        
        int szam1 = 2, szam2 = 3, szam3 = 4, szam4 = 3;
        osszeg = osszead(szam1, szam2);
        szoveg = ("%d + %d = %d".formatted(szam1, szam2, osszeg));
        kiir(szoveg);
        
        osszeg = szamokOsszeadasa(szam1, szam2, szam3, szam4);
        szoveg = ("%d + %d + %d + %d = %d".formatted(szam1, szam2, szam3, szam4, osszeg));
        kiir(szoveg);
        
        //osszeg = gyokvonas(int eredmeny);
       // int eredmeny = gyokvonas(sint a, int b, int c, int eredmeny);
                
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
        System.out.printf(szoveg +"\n");
    }

    private static int szamokOsszeadasa(int a, int b, int c, int d) {
        return a+b+c+d;
    }

    private static int gyokvonas(int a, int b, int c, int eredmeny) {
        int osszeg = a+b+c;
        int gyok = Math.abs(osszeg);
        
        return gyok;
    }
}
