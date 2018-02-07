package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        boolean enteredInt = false;
        int numTests = 0;

        while (!enteredInt) {
            try {
                System.out.print("Enter number of tests 1-5: ");
                numTests = Integer.parseInt(console.nextLine());
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

        int[] testArray = new int [numTests];
        while (numTests > 0) {
            System.out.print("Enter test score for test " +  numTests + ": ");
            int i = 0;
            i = Integer.parseInt(console.nextLine());
            testArray[numTests - 1] = i;
            numTests--;
        }




    }
}
