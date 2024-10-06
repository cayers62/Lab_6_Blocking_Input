import java.util.Scanner;

public class FuelCost {

public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);

    //Declaration of variables

    double gallons = 0.0;
    double milesPerGallon = 0.0;
    double pricePerGallon = 0.0;
    double milesCanTravel = 0.0;
    double Total_Cost = 0.0;
    String trash = "";
    boolean done = false;

    //User input number of gallons
    do {

        System.out.print("Enter number of gallons you tank can hold: ");

        if(in.hasNextDouble())
        {
            gallons = in.nextDouble();
            in.nextLine(); //Clears new line from buffer
            done = true; // Received valid input can move one
        }
        else  //Did not receive valid input have to read as a string
        {
            trash = in.nextLine();
            System.out.println("You said number of gallons is: " + gallons);
            System.out.println("That is not a valid entry try again!");
        }
    }while(!done);

    //User inputs fuel economy/miles per gallon

    do {
        System.out.print("Enter fuel economy of your car: ");

        if(in.hasNextDouble())
        {
            milesPerGallon = in.nextDouble();
            in.nextLine(); //Clears new line from buffer
            done = true; //Received valid input can move one
        }
        else //Did not receive valid input have to read as a string
        {
            trash = in.nextLine();
            System.out.println("You said your fuel economy was: " + milesPerGallon);
            System.out.println("That is not a valid entry try again!");
        }
    }while(!done);

    //User inputs price of gas per gallon

    do {

        System.out.print("Enter the current cost of gas: ");

        if(in.hasNextDouble())
        {
            pricePerGallon = in.nextDouble();
            in.nextLine(); //Clears new line from buffer
            done = true;
        }
        else //Did not receive valid input have to read as a string
        {
            trash = in.nextLine();
            System.out.println("You said the current cost of gas is: $"+pricePerGallon);
            System.out.println("That is not a valid entry try again!");
        }
    }while(!done);

    milesCanTravel = gallons * milesPerGallon;
    Total_Cost = 100 / milesPerGallon;
    System.out.println("The you can travel up to " + milesCanTravel + "miles");
    System.out.println("The cost per 100 miles is: $ " + Total_Cost);

}

}