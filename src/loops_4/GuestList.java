package loops_4;

import java.util.Scanner;

public class GuestList {
    /*
    Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guests.
If yes - take the next guest input
If not - finish the program and print list of the guests.
     */
    public static void main(String[] args) {
        System.out.println("Please enter guest name:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int num = 1;
        do {
            System.out.println(name);
            System.out.println("Do you want to enter new guest name:");
            String newName = input.nextLine();

        } while (num > 3);




    }
}
