import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //Declaration of variables

        double length = 0.0;
        double height = 0.0;
        double area = 0.0;
        double perimeter = 0.0;
        double diagonal = 0.0;
        boolean done = false;
        String trash = "";

        // User inputs the length of a rectangle.

        do
        {
            System.out.print("Enter the length of a rectangle: ");

            if(in.hasNextDouble())
            {
                length = in.nextDouble();
                in.hasNextLine(); // Clears new line from buffer
                done = true;
            }
            else // Received invalid input has to be read as string
            {
                trash = in.nextLine();
                System.out.println("You said the length of the rectangle is " + trash);
                System.out.println("Not a valid entry try again!");

            }

        }while(!done);

        // User inputs the height of a rectangle.

        System.out.print("Enter the height of a rectangle: ");

        do
        {
            if(in.hasNextDouble())
            {
                height = in.nextDouble();
                in.hasNextLine();// Clears new line from buffer
                done = true;

            }
            else // Received invalid input hast to read as a string
            {
                trash = in.nextLine();
                System.out.println("You said the height of the rectangle is " + trash);
                System.out.println("Not a valid entry try again!");
            }
        }while(!done);

        area = length * height;
        perimeter = (2 * length) + (2 * height);
        diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(height, 2));
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is "  + perimeter);
        System.out.println("The length of the diagonal is " + diagonal);

    }
}
