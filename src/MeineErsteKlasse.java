public class MeineErsteKlasse {

    public static void main(String[] args) {

        int zahl1 = 5;
        int zahl2 = 10;

        System.out.println(verdoppeln(zahl1));
        System.out.println(addiere(zahl1, zahl2));

        System.out.println(verdoppeln(multipliziere(zahl1, zahl2)));

        ausgabe(addiere(zahl1, zahl2));


    }
    public static int verdoppeln (int a){
        return a*2;
    }
    public static int addiere (int a, int b){
        return a+b;
    }
    public static int multipliziere(int a, int b){
        return a*b;
    }
    public static void ausgabe(int a){
        System.out.println("Summe = " + a);
    }
}
