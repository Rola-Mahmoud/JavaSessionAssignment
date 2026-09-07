package Session2;

import java.util.Scanner;

public class AddingTwoNumbers {
    public static void main(String[] args) {
        boolean again;
        Scanner scanner= new Scanner(System.in);
        do{
           //what we need
            System.out.println("Enter First Number : ");
            int num1 = scanner.nextInt();
            System.out.println("Enter Second Number : ");
            int num2 = scanner.nextInt();

            //calculations
            int sum = num1 + num2;
            System.out.println("The sum is " + sum);
            System.out.println("Do you want to continue ? True / False");
            again = scanner.nextBoolean();

        }while (again);
        scanner.close();
    }
}
