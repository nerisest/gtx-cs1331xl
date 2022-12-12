import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value and the day of the week: ");
        int fahrenheit = input.nextInt();
        String day = input.next();
        double celsius = (5.0/9) * (fahrenheit - 32);
        // String day1 = day.substring(0,1).toUpperCase();
        // String dayCapitalized = day1 + day.substring(1);
        //System.out.println(day + " Fahrenheit: " + fahrenheit);
        System.out.println(day + " Celsius: " + celsius);
        input.close(); // closing Scanner..?
    }
}