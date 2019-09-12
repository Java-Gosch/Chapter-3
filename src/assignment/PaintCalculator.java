package assignment;

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String [] args) {
        double l;
        double h;
        double w;

        Scanner input = new Scanner(System.in);
        System.out.print("What is the length of your room in feet>>>");
        l = input.nextDouble();
        System.out.print("What is the height of your room in feet>>>");
        h = input.nextDouble();
        System.out.print("What is the width of your room in feet>>>");
        w = input.nextDouble();

        calculateArea(l,w,h);
    }
    public static void calculateArea(double l, double h, double w)
    {
        double area;

        area = ((w*h)*2) + ((h*l)*2);
        calculatePrice(area);
    }
    public static void calculatePrice(double area)
    {
        double numberGallons;
        double totalPrice;
        int gallonsRounded;
        final double GALLON_PRICE = 32;
        final double GALLON_PAINT_COVERAGE = 350;

        numberGallons = area/GALLON_PAINT_COVERAGE;
        totalPrice = GALLON_PRICE * numberGallons;
        gallonsRounded = (int)Math.ceil(numberGallons);
        System.out.println("The area of the room is " + area + " number of gallons needed is " + gallonsRounded + " with a total cost of $" + totalPrice);


    }
}
