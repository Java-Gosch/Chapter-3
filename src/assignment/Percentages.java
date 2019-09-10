package assignment;

import java.util.Scanner;

public class Percentages {
    public static void main(String [] args)

    {
        double num1;
        double num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number >>>");
        num1 = input.nextDouble();
        System.out.print("Enter another number >>>");
        num2 = input.nextDouble();

        calculatePercent(num1, num2);

    }

    public static void calculatePercent(double num1, double num2)
    {
        double percent1;
        double finalPercent;

        double percent2;
        double finalPercent2;


        percent1 = num1 / num2;
        finalPercent =  percent1 *100;

        percent2 = num2 / num1;
        finalPercent2 = percent2 *100;

        System.out.print(num1 + " is " + finalPercent + "% of " + num2);
        System.out.print(num2 + " is " + finalPercent2 + "% of " + num1);

    }
}
