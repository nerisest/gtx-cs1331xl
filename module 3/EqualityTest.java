public class EqualityTest {
    public static void main(String [] args) {
        // String x = "park";
        String x = new String ("park");
        String y = "home";

        if (x == y) {
            System.out.println("x and y are aliases");
        }
        
        if (x != y) {
            System.out.println("x and y are not aliases");
        }

        if (x.equals(y)) {
            System.out.println("x and y have the same contents");
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
    }

}