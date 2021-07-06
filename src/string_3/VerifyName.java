package string_3;

import java.util.*;

public class VerifyName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Enter full name:");
        String name = scan.nextLine();
        if (name.equalsIgnoreCase("Max Payne") || name.equalsIgnoreCase("Alan Wake")) {
            System.out.println("User found!");
        } else {
            System.out.println("User not found!");
        }



    }
}
