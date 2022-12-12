// import java.util.Locale; (used for getCurrencyInstance by typing in Locale.[insert country here] in the brackets to give the desired currency symbol)
import java.util.Scanner;
import java.text.NumberFormat;

public class CurrencyDemo{
    public static void main(String[] args) {
        int items;
        double itemCost, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        items = input.nextInt();
        System.out.print("Enter the cost per item: ");
        itemCost = input.nextDouble();
        total = items * itemCost;
        System.out.println();
        System.out.println("Unformatted total: " + total);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println("Formatted total: " + currencyFormat.format(total));
        input.close();
    }
}
