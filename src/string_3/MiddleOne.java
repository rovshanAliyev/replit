package string_3;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        if (word.length() % 2 == 1) {
            if (word.length() >= 2) {
                System.out.println(word.charAt(word.length() / 2));
            } else {
                System.out.println(word+word+word);
            }
        } else if (word.length() >= 3) {
            System.out.print(word.charAt((word.length() / 2)-1));
            System.out.print(word.charAt(word.length() / 2));
        } else {
            System.out.println(word+word);
        }
    }
}