package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        final double conversionFactor = 0.09290304;
        System.out.println( "What is the length of the room in feet?" );
        int length = input.nextInt();
        System.out.println( "What is the width of the room in feet?" );
        int width = input.nextInt();
        int squareFeet = length * width;
        double squareMeters = squareFeet * conversionFactor;
        System.out.printf( "You entered dimensions of %d feet by %d feet.", length, width);
        System.out.printf("The area is %d square feet.\n%f square meters", squareFeet, squareMeters);
    }
}
