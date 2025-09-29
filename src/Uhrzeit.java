public class Uhrzeit {
    public static void main(String[] args) {

        System.out.println(uhrzeitRechner(23,5));

    }

    public static int uhrzeitRechner(int uhrzeit, int n){

        return (uhrzeit+n)%24;
    }
}
