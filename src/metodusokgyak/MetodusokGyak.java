package metodusokgyak;

public class MetodusokGyak {
    
    static int szam1, szam2, szam3, szam4, osszeg;
    static String szoveg;

    public static void main(String[] args) {
        feladatok();
    }
    
     private static void feladatok() {
         SzamOsszegeElsoF();
         Osszeadasok();
         Gyokvonas();        
    }
    
    private static int elso10SzamOsszege(){
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;        
    }

    private static int osszead(int a, int b) {      
        
        return a + b;
    }
    
    private static void kiir(String szoveg) {
        System.out.printf(szoveg +"\n");
    }   

    private static void SzamOsszegeElsoF() {
        //Első 10 számjegy összege
        osszeg = elso10SzamOsszege();
        szoveg = "Az első 10 szám összege" + osszeg;
        kiir(szoveg);
    }

    private static void Osszeadasok() {
         //Összeadás
        szam1 = 1;
        szam2 = 2;
        szam3 = 4;
        szam4 = 3;        
        osszeg = osszead(szam1, szam2);
        szoveg = ("%d + %d = %d".formatted(szam1, szam2, osszeg));
        kiir(szoveg);
        
        //Összeadás
        osszeg = osszead(1, 2);
        osszeg = osszead(osszeg, szam3);
        osszeg = osszead(osszeg, szam4); 
        kiir("%d + %d + %d + %d = %d".formatted(szam1, szam2, szam3, szam3, osszeg));        
    }

    private static void Gyokvonas() {
        //Gyökvonás
       int a = 3, b = 4, c = 2;
       osszeg = osszead(a,b);
       osszeg = osszead(osszeg, c);
       String s ="%d + %d + %d gyöke".formatted(a, b, c);
       double gyok = Math.sqrt(osszeg);
       String kimenet = String.format("%s %.4f\n",s, gyok );
       kiir(kimenet);        
    }
   
}