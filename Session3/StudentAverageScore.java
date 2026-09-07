package Session3;

import java.util.Scanner;

public class StudentAverageScore {
    public static void main(String[] args) {
        int numberOfStudents = 3;
        int numberOfCourses = 4;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= numberOfStudents ; i++){
            double total = 0;
            for (int j = 1; j <= numberOfCourses ; j++){
                System.out.println("Enter the grade of course " + j + " for student " + i);
                double score = scanner.nextDouble();
                total += score;
            }
            System.out.println("Average score for student "+ i + " = " + total/numberOfCourses);
        }
        scanner.close();
    }
}
