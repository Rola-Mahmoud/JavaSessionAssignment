package Session2;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args){
//        //Example 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number to check : ");
//        int numberToCheck = scanner.nextInt();
//        if(numberToCheck % 2 == 0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }
//        scanner.close();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number to check : ");
//        int numberToCheck = scanner.nextInt();
//        if(numberToCheck > 0){
//            System.out.println("Positive");
//        } else if (numberToCheck < 0) {
//            System.out.println("Negative");
//        }else {
//            System.out.println("Zero");
//        }
//        scanner.close();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter First Number : ");
//        double num1 = scanner.nextDouble();
//        System.out.println("Enter Second Number : ");
//        double num2 = scanner.nextDouble();
//        System.out.println("Enter Third Number : ");
//        double num3 = scanner.nextDouble();
//
//        if (num1 > num2 && num1 > num3){
//            System.out.println("The largest number is " + num1);
//        }else if(num2 > num1 && num2 > num3){
//            System.out.println("The largest number is " + num2);
//        }else {
//            System.out.println("The largest number is " + num3);
//        }
//        scanner.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter day number");
        int dayNumber = scanner.nextInt();
        scanner.close();
//        if (dayNumber == 1){
//            System.out.println("Saturday");
//        } else if (dayNumber == 2){
//            System.out.println("Sunday");
//        }else if (dayNumber == 3){
//            System.out.println("Monday");
//        }else if (dayNumber == 4){
//            System.out.println("Tuesday");
//        }else if (dayNumber == 5){
//            System.out.println("Wednesday");
//        }else if (dayNumber == 6){
//            System.out.println("Thursday");
//        }else if (dayNumber == 7){
//            System.out.println("Friday");
//        }else{
//            System.out.println("Invalid day number");
//        }

        switch (dayNumber){
            case 1: System.out.println("Saturday");
            break;
            case 2: System.out.println("Sunday");
            break;
            case 3: System.out.println("Monday");
            break;
            case 4: System.out.println("Tuesday");
            break;
            case 5: System.out.println("Wednesday");
            break;
            case 6: System.out.println("Thursday");
            break;
            case 7: System.out.println("Friday");
            break;
            default: System.out.println("Invalid day number");
        }

    }
}
