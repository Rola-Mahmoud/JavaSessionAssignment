package Session3;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        boolean flag = false;
        int position = 0;
        for (int i = 0; i < name.length(); i++){
            if (name.charAt(i) == 'a' || name.charAt(i) == 'A'){
                flag = true;
                position = i +1;
                break;
            }
        }
        if (flag){
            System.out.println("");
        }
    }
}
