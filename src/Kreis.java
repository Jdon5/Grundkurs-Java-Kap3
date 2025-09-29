public class Kreis {
    public static void main(String[] args) {

        System.out.println(kreisDurchmesser(2));
        System.out.println(kreisflaeche(3));
        System.out.println(kreisUmfang(3));

    }

    public static double kreisflaeche(double r){
        double pi = 3.14159;
        return pi*r*r;
    }
    public static double kreisUmfang(double r){
        double pi = 3.14159;
        return 2*pi*r;
    }

    public static double kreisDurchmesser(double r){
        return 2*r;
    }

}
