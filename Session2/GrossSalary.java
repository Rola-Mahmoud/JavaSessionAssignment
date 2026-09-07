package Session2;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args){
        //what we have
        int rate = 15;
        double maxWeeklyHours=40;

        //what we need
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter working hours :");
        double workingHours = scanner.nextDouble();

        //validation
        while (workingHours > maxWeeklyHours){
            System.out.println("Please enter value between 1 and 40 : ");
            workingHours = scanner.nextDouble();
        }
        scanner.close();
        //calculations
        double grossSalary = rate * workingHours;
        System.out.println("The gross salary is : " + grossSalary);
    }
}
