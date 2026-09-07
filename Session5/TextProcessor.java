package Session5;

import java.util.Scanner;

public class TextProcessor {
    static Scanner scanner = new Scanner(System.in);
    private static String [] words;

    public static void main(String[] args) {
        System.out.println("Enter the text to be processed : ");
        String input = scanner.nextLine();
        printWords(input);
        countWords();

        reverseText("Hello World");

        System.out.println( addSpaces("ILoveRouteAcademy"));
    }

    public static void printWords(String input) {
        words = input.split(" ");
        for(String word : words){
            System.out.println(word);
        }
//        for (int i = 0; i < input.length(); i++){
//            if(input.charAt(i) != ' '){
//                System.out.print((input.charAt(i)));
//            }else{
//                System.out.println();
//            }
//        }
//        System.out.println();
//
   }

   public static void countWords(){
       System.out.println(String.format("Your Text Contains %d Words" , words.length));
   }
   public static void reverseText(String input){
       StringBuilder reversed = new StringBuilder(input);
       System.out.println(reversed.reverse());
//        for (int i = words.length - 1; i >= 0; i--) {
//            System.out.println(words[i]);
//        }
   }
   public static String addSpaces(String input){
       String textWithSpaces = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                if(i==0) {
                    textWithSpaces += input.charAt(i);
                }
                else {
                    textWithSpaces += " ";
                    textWithSpaces += input.charAt(i);
                }
            }else{
                textWithSpaces += input.charAt(i);
            }
        }
        return textWithSpaces;
   }
}
