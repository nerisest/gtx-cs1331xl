import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("List of operations: add subtract multiply divide alphabetize"); // printing out the list of operations
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an operation: ");
        String operation = input.next().toLowerCase(); // case-insensitive input

        switch (operation) { // using switch, we get cases for the input for operations and the base "default" case
            case "add":
                System.out.print("Enter two integers: ");
                if (input.hasNextInt()) {
                    int num1 = input.nextInt();
                    int num2 = input.nextInt();
                    int num3 = num1 + num2;
                    System.out.println("Answer: " + num3);
                    break;
                }

                else {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                
            case "subtract":
                System.out.print("Enter two integers: ");
                if (input.hasNextInt()) {
                    int num4 = input.nextInt();
                    int num5 = input.nextInt();
                    int num6 = num4 - num5;
                    System.out.println("Answer: " + num6);
                    break;
                }
                
                else {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                
            case "multiply":
                System.out.print("Enter two doubles: ");
                if (input.hasNextDouble()) {
                    double num7 = input.nextDouble();
                    double num8 = input.nextDouble();
                    double num9 = num7 * num8;
                    System.out.printf("Answer: %.2f", num9);
                    break;
                }

                else {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }
                
            case "divide":
                System.out.print("Enter two doubles: ");
                if (input.hasNextDouble()) {
                    double num10 = input.nextDouble();
                    double num11 = input.nextDouble();
                    double num12 = num10 / num11;
                    System.out.printf("Answer: %.2f", num12);
                    break;
                }
               
                else {
                    System.out.println("Invalid input entered. Terminating...");
                    break;
                }

            case "alphabetize":
                System.out.print("Enter two words: ");
                String str1 = input.next();
                String str2 = input.next();
            
                if (str1.compareTo(str2) > 0) {
                    System.out.println(str1 + " comes before " + str2 + " alphabetically.");
                    break;
                }

                if (str1.compareTo(str2) < 0) {
                    System.out.println(str2 + " comes before " + str1 + " alphabetically.");
                    break;
                }

                else {
                    System.out.println("Chicken or Egg.");
                    break;
                }

            default:
                System.out.println("Invalid input entered. Terminating...");
                break;
        }
    input.close();
    }
    
}