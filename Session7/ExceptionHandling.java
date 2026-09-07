package Session7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
//        createFile();
        try {
            createFileRethrow();
        }catch (IOException e){
            System.out.println("Hello from after the execution2");

        }
        handleNumbersException();

    }

    //CompileTime Exception
    public static void createFile(){
        File file = new File("resources/text.txt");
        try {
            file.createNewFile();
        } catch (IOException e){
            System.out.println("The path does not exist");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Hello from after the execution");

    }

    public static void createFileRethrow() throws IOException {
        File file = new File("resources/text.txt");
        file.createNewFile();
        System.out.println("Hello from after the execution1");

    }

    //RunTime Exception (M4 by2oly)
    public static void handleNumbersException(){
        File file = new File("resources/text.txt");
        //Scanner scanner = null;
        try (Scanner scanner = new Scanner(file)){ //Try with resources
            // scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                double num = scanner.nextDouble();
                System.out.println("The number is " + num);
            }

        } catch (FileNotFoundException | InputMismatchException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
//        finally {
//            scanner.close();
//        }
        System.out.println("Hello from after the execution");
    }



}
