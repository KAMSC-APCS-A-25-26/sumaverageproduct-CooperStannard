/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers 
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

import java.util.Scanner;

public class SumProductAverage {
    public static void main(String[] args) {
        // TODO
        Scanner sc = new Scanner(System.in);

        // Signature
        System.out.println("Cooper Stannard\nAPCS-A\n2.2 and 2.3\n\n");

        //Asks for number of runs
        System.out.print("Enter number of runs:  ");
        double numruns = sc.nextDouble();
        for (int k=0; k < numruns; k++)
        {
            // Reads in three numbers
            System.out.print("\nEnter a number:  ");
            double num1 = sc.nextDouble();
            System.out.print("Enter a number:  ");
            double num2 = sc.nextDouble();
            System.out.print("Enter a number:  ");
            double num3 = sc.nextDouble();

            // Preforms the math and prints the answer
            double sum = num1 + num2 +num3;
            double avg = sum/3;
            System.out.println("The average is " + avg );
            System.out.println("The sum is " + sum);

            double prod = num1 * num2 * num3;
            System.out.println("The product is " + prod);


        }

    }
}