package assignment;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args)
    {

        double temperature;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature for 8:00 in Celsius for conversion >>>");
        temperature = input.nextDouble();
        displayConversion(temperature, "8:00 AM, ");
        System.out.println("Enter the temperature for 12:00 in Celsius for conversion >>>");
        temperature = input.nextDouble();
        displayConversion(temperature, "12:00 PM, ");
        System.out.println("Enter the temperature for 5:00 in Celsius for conversion >>>");
        temperature = input.nextDouble();
        displayConversion(temperature, "5:00 PM, ");

    }
    public static void displayConversion(double temperature, String time)
    {
        double tempConversion;
        final double CELSIUS_TO_FAHRENHEIT = (temperature + 32) * .55;

        tempConversion = temperature - CELSIUS_TO_FAHRENHEIT;
        System.out.println("In " + temperature + " Celsius, it is " + tempConversion + " in Fahrenheit at " + time);
    }

}
