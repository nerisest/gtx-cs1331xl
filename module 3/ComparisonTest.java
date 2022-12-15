public class ComparisonTest {
    public static void main(String[] args) {
        String x = "park";
        String y = "p4rk";

        if (x.compareTo(y) > 0) {
            System.out.println("x is greater than y");
            System.out.println("x: " + x);
            System.out.println("y: " + y);

        // returns x is greater than y, referring to unicode codes, a = 97 while 4 = 34
    }
}

}