package assignment;

import java.util.Scanner;

public class MetricConversion {
    public static void main(String [] args)
    {
        int number;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number for metric conversion");
        number = keyboard.nextInt();

    }
    public static void metricInchConversion(int number)
    {
        final double  CENTIMETER_IN_INCH = 2.54;
        double numberConversion;

        numberConversion = number * CENTIMETER_IN_INCH;
        System.out.print("In " + number + " inches, there are " + numberConversion + " centimeters");


    }
    public static void metricGallonConversion(int number)
    {
        
    }
}
