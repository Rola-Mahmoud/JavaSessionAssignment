package Session2;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        //what we need
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of items : ");
        int numberOfItems = scanner.nextInt();
        double itemPrice;
        double total = 0;
        for (int i = 1; i <= numberOfItems; i++ ){
            System.out.println("Please enter price of item "+ i);
            itemPrice =scanner.nextInt();
            total +=itemPrice;
        }
        scanner.close();
        System.out.println("The total price is :" + total);
    }
}
