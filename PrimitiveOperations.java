public class PrimitiveOperations {
    public static void main(String[] args) {
        int a = 5;
        double b = 3.5;
        System.out.println(a);
        System.out.println(b);

        double c = a * b;
        System.out.println("c is equal to: " + c);

        double d = (double)a;
        System.out.println(d);

        int e = (int)b;
        System.out.println(e);

        char f = 'A';
        System.out.println(f);

        int g = (int)f;
        char h = (char)(g + 32);
        System.out.println(h);
    }
}