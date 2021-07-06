package variables_1;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        int areaCode = scan.nextInt();
        int localNumber = scan.nextInt();

        String phoneNumber;
//WRITE YOUR CODE HERE:
        phoneNumber = ("("+areaCode+")-"+localNumber);
        System.out.println(phoneNumber);
    }
}