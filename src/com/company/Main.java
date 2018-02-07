package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        boolean enteredInt = false;
        int numTests = 0;
        int loopTests = 0;
        int arrayLength = 0;
        int percentageFinder = 0;

        while (!enteredInt) {
            try {
                System.out.print("Enter number of tests 1-5: ");
                numTests = Integer.parseInt(console.nextLine());
                loopTests = numTests;
                percentageFinder = numTests;
            } catch (NumberFormatException ex) {
                System.out.println("That is not a number.");
            }
            if (numTests > 5) {
                System.out.println("Number is too big.");
                enteredInt = false;
            }
            else {
                System.out.println("That is a valid number of tests.");
                enteredInt = true;
            }

        }

        double[] testArray = new double [numTests];
        while (numTests > 0) {
            System.out.print("Enter test score for test " +  numTests + ": ");
            double i = 0;
            i = Integer.parseInt(console.nextLine());
            testArray[loopTests - 1] = i;
            loopTests--;
            numTests--;
        }

        double testAverage = 0;
        arrayLength = testArray.length;
        int max = testArray.length;
        System.out.println(arrayLength);

        for(int counter = 0; counter<max;counter++){
            testAverage += testArray[counter];
        }

        testAverage = testAverage / percentageFinder;
        System.out.println(testAverage);



    }
}
