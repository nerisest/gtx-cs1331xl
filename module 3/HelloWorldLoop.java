public class HelloWorldLoop {
    public static void main(String[] args) {
        
        // while loop demo (Hello, World 10 -> Hello, World! 1)

        int lineNum1 = 10;
        while (lineNum1 > 0) {
            System.out.println("Hello, World! " + lineNum1);
            lineNum1--;
        }

        // while loop demo (Hello, World 1 -> Hello, World! 10)

        int lineNum2 = 1;
        while (lineNum2 <= 10) { 
            System.out.println("Hello, World! " + lineNum2);
            lineNum2++;
        }

        // do-while statement demo (Hello, World 1 -> Hello, World! 10)
        
        int lineNum3 = 1;
        do {
            System.out.println("Hello, World! " + lineNum3); 
            lineNum3++; 
        } while (lineNum3 <= 10); 

        // for statement demo (Hello, World 1 -> Hello, World! 10)

        int lineNum4 = 1;
        for (lineNum4 = 1; lineNum4 <= 10; lineNum4++) { // for (initialisation statement, boolean expression as condition, update statement)
            System.out.println("Hello, World! " + lineNum4); // body statement
        }
    }
}