package variables_1;

import java.util.*;

public class FindMidNumber {
    /*
    Write a program that will return mid number out of three numbers.  No need to do any calculations.
1. Create an object of Scanner class.
2. Declare int 3 variables: num1, num2, num3.
Example:
```
Enter first number:
14
Enter second number:
52
Enter third number:
25
Medium value is: 25
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        System.out.println("Enter second number");
        int num2 = scan.nextInt();
        System.out.println("Enter third number");
        int num3 = scan.nextInt();

        if (num1>num2 && num1<num3) {
            System.out.println("Medium value is: " + num1);
        } else if (num2>num1 && num2<num3) {
            System.out.println("Medium value is: " + num2);
        } else {
            System.out.println("Medium value is: " + num3);
        }

    }
}
