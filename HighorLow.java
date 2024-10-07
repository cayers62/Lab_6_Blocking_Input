import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        // Random int generator
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        int val = gen.nextInt(10) + 1;
        int num = 0;
        String trash = "";
        boolean done = true;


        do {
            System.out.print("Enter a number between 1 and 10: ");

            if (in.hasNextInt()) {

                //Okay to ready as a number
                num = in.nextInt();
                in.nextLine();//clear the buffer
                if (num >= 1 && num <= 10) {
                    System.out.println("The number you guessed is " + num);

                    if (num > val) {
                        System.out.println("The number was " + val + " You guessed too high!");
                    }
                    if (num < val) {
                        System.out.println("The number was " + val + " You guessed too low!");
                    }
                    if (num == val) {
                        System.out.println("The number was " + val + " You are right on the money!");
                    }
                } else {

                    trash = in.nextLine(); // Okay to read as a string
                    System.out.println("Please enter valid information a number between 1 and 10 not " + trash);
                    done = false;
                }
            }



        } while (!done);
    }
}
