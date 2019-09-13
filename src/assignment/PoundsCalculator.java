package assignment;

import java.util.Scanner;

public class PoundsCalculator {
    public static void main(String [] args){

        double poundsEntered;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of pounds to comvert >>>");
        poundsEntered = input.nextDouble();

        calculateKilograms(poundsEntered);
        calculateOunces(poundsEntered);
        calculateMilligrams(poundsEntered);

    }
    public static void calculateKilograms(double poundsEntered){
        double conversion = poundsEntered / 2.205;
        System.out.println("In " + poundsEntered + " pounds, there are " + conversion + " in Kilograms");
    }
    public static void calculateOunces(double poundsEntered){
        double conversion = poundsEntered * 16;
        System.out.println("In " + poundsEntered + " pounds, there are " + conversion + " in Ounces");
    }
    public static void calculateMilligrams(double poundsEntered){
        double conversion = poundsEntered * 453592.37;
        System.out.println("In " + poundsEntered + " pounds, there are " + conversion + " in Milligrams");
    }
}
