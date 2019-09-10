package examples;

import java.util.Scanner;

public class DemoRaise {

    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);

        double salary;
        double startingWage;
        System.out.println("Demonstrating some raises:");

        System.out.println("Enter your salary >>>");
        salary = keyboard.nextDouble();


        predictRaise(salary);


    }

    public static void predictRaise(double salary){

        double newSalary;
        final double RAISE_RATE = 1.10;
        newSalary = salary * RAISE_RATE;

        System.out.println("Current salary " + salary + "\nAfter raise: " + newSalary);
    }

    public static void pl(String p){
        System.out.println(p);
    }
}
