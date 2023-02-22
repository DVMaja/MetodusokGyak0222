package metodusokgyak;

public class MetodusokGyak {

    public static void main(String[] args) {
        
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
    
    private static void osszeadasKiiras(int a, int b, int osszeg) {
        System.out.printf("%d + %d = %d\n",osszeg);
    }
}
