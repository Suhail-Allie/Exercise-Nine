package org.example;

import java.util.Scanner;

public class Main {
    // Method to find the smallest element in an array of doubles
    public static double min(double[] array) {
        double min = array[0];
        for (double num : array) {
            if (num < min) min = num;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declare array of double
        double[] numbers = new double[10];

        // Read ten numbers from the user
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        // Find and display the minimum value
        System.out.println("The minimum value is: " + min(numbers));

        input.close();
    }
}