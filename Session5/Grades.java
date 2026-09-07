package Session5;

import java.util.Scanner;

public class Grades {
    static Scanner scanner = new Scanner(System.in);
    private static int [] grades;
    public static void main(String[] args) {

        System.out.println("Enter the number of courses : ");
        //int numOfCourses = scanner.nextInt();
        grades = new int[scanner.nextInt()];
        getGrades();
        printGrades();
        System.out.println("Average score of the grades is : " + String.format("%.2f",calculateAverage()));
        System.out.println("Highest score is " + highestScore());
        System.out.println("Lowest score is " + lowestScore());
        scanner.close();
    }

    public static void getGrades(){
        for (int i = 0; i < grades.length; i++){
            System.out.println("Enter the grade of course " + (i+1) + ": ");
            grades[i] = scanner.nextInt();
        }
    }
    public static void printGrades(){
        for (int i = 0; i < grades.length; i++){
            System.out.println("Grade of course " + (i+1) + " is : " +grades[i]);
        }
    }
    public static double calculateAverage(){
        return (double) calculateSum() /grades.length;
    }
    public static int calculateSum (){
        int sum = 0;
        for (int i = 0; i < grades.length; i++){
            sum += grades[i];
        }
        return sum;
    }
    public static int highestScore() {
        int highestScore = grades[0];
        for (int i = 0; i < grades.length; i++){
            if (grades[i] > highestScore){
                highestScore = grades[i];
            }
        }
        return highestScore;
    }
    public static int lowestScore() {
        int lowestScore = grades[0];
        for (int i = 0; i < grades.length; i++){
            if (grades[i] < lowestScore){
                lowestScore = grades[i];
            }
        }
        return lowestScore;
    }
}
