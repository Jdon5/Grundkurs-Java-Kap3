public class Verpackung {
    public static void main(String[] args) {
        int n = 24;
        int karton = 20;

        int volleKartons = n/karton;
        int uebergebliebeneFlaschen = n%karton;
        System.out.println("Anzahl der vollen Kartons: "+volleKartons);
        System.out.println("Anzahl der übergebliebenen Flaschen: "+ uebergebliebeneFlaschen);
    }
}
