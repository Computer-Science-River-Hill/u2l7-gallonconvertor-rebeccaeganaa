package org.example; //DO NOT DELETE
import java.text.NumberFormat;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of gallons: ");
        double gal = scanner.nextInt();
        NumberFormat decimal = NumberFormat.getNumberInstance();
        System.out.println("In " + decimal.format(gal) + " gallons there are: ");
        double quarts = gal*4.0;
        double pints = quarts*2.0;
        double cups = pints*2.0;
        double tbsp = cups*16.0;
        System.out.println(decimal.format(quarts) + " quarts");
        System.out.println(decimal.format(pints) + " pints");
        System.out.println(decimal.format(cups) + " cups");
        System.out.println(decimal.format(tbsp) + " tablespoons");
    }
}