package com.Java.Basics;

import java.util.Scanner;

public class CollegeGradeSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your percentage to get your Grade : ");
        float percentage = scn.nextFloat();

        if (percentage >= 75 && percentage < 100) {
            System.out.println("Your Grade is First Division with Distinction");
        }
        else if (percentage >= 60 && percentage < 75) {
            System.out.println("Your Grade is First Division");
        }
        else if (percentage >= 50 && percentage < 60) {
            System.out.println("Your Grade is Second Division");
        }
        else if (percentage >= 40 && percentage < 50) {
            System.out.println("Your Grade is Third Division");
        }
        else if (percentage < 40) {
            System.out.println("You are Fail");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
