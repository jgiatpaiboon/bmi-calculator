/*
 *  Assignment 2
 *  Description: This program is a BMI calculator
 *  Name: James Giatpaiboon
 *  ID: 917848716
 *  Class: CSC 211-03
 *  Semester: Fall 2019
 */

import java.util.Scanner;   // Imported scanner to read the user input.

public class BMICalculator {

    public static void main (String[] args) {


        int weight; //Weight of user
        double height;  //Height of user
        double BMI; //BMI of user
        int BMICast;    // BMI as integer

        Scanner input = new Scanner(System.in); // Created for user to input

        System.out.println("Input your weight in kilogram:");   //Tells user to input weight
        weight = input.nextInt();   //stores input to weight


        System.out.println("Input your height in meters:"); //Tells user to input height
        height = input.nextDouble();    //Stores input to height

        BMI = weight / (height * height);   //Calculates BMI
        BMICast = (int)BMI; //Changes the BMI value to integer

        // Displays results of all of users input
        System.out.println("Your weight is: " + weight + "kg");
        System.out.println("Your height is:" + height + "m");
        System.out.println("Your BMI is:" + BMI + "kg/m2");
        System.out.println("----------------------------------");
        System.out.println("Your BMI Casted into an int is: " + BMICast + "kg/m2" );

    }

}