package metodusokgyak;

public class MetodusokGyak {

    public static void main(String[] args) {
        feladatok();
    }
    
     private static void feladatok() {
         int osszeg = elso10SzamOsszege();
        String szoveg = "Az első 10 szám összege" + osszeg;
        kiir(szoveg);
        
        int szam1 = 1, szam2 = 2, szam3 = 4, szam4 = 3;        
        osszeg = osszead(szam1, szam2);
        szoveg = ("%d + %d = %d".formatted(szam1, szam2, osszeg));
        kiir(szoveg);
        
        osszeg = osszead(1, 2);
        osszeg = osszead(osszeg, szam3);
        osszeg = osszead(osszeg, szam4); 
        kiir("%d + %d + %d + %d = %d".formatted(szam1, szam2, szam3, szam3, osszeg));
               
       
       int a = 3, b = 4, c = 2;
       osszeg = osszead(a,b);
       osszeg = osszead(osszeg, c);
       String s ="%d + %d + %d gyöke".formatted(a, b, c);
       double gyok = Math.sqrt(osszeg);
       String kimenet = String.format("%s %.4f\n",s, gyok );
        kiir(kimenet);
        
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

   
}
