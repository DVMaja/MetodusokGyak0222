package metodusokgyak;

public class MetodusokGyak {

    public static void main(String[] args) {
        int osszeg = elso10SzamOsszege();
        eredmenyKiiras(osszeg);
        
        int a = 1;
        int b = 2;
        osszeg = osszead(a, b);
        eredmenyKiiras(osszeg);
    }
    
    private static int elso10SzamOsszege(){
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
        
    }

    private static void eredmenyKiiras(int osszeg) {
        System.out.printf("Az első 10 szám összege %d\n",osszeg);
    }

    private static int osszead(int a, int b) {
        int osszeg = a + b;
        return osszeg;
    }
    
    
}
