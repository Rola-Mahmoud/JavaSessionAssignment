package Session2;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args){
        //Example 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the first number : ");
//        int num1 = scanner.nextInt();
//        System.out.println("Please enter the second number : ");
//        int num2 = scanner.nextInt();
//        scanner.close();
//        int LargestNum = num1 > num2 ? num1 : num2;
//        System.out.println("The largest number is : " + LargestNum);



        //Example 3

        Scanner scanner = new Scanner(System.in);
        String dayName= scanner.next();
        switch (dayName){
//            case "Saturday","saturday": System.out.println(1);
//                break;
//            case "Sunday","sunday": System.out.println("2");
//                break;
//            case "Monday","monday": System.out.println(3);
//                break;
//            case "Tuesday","tuesday": System.out.println(4);
//                break;
//            case "Wednesday","wednesday": System.out.println(5);
//                break;
//            case "Thursday","thursday": System.out.println(6);
//                break;
//            case "Friday","friday": System.out.println(7);
//                break;
            default: System.out.println("Invalid day number");
        }
    }
}
