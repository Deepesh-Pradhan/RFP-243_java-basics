package com.bridgelabz.javabasics;

import java.util.Scanner;

public class DataTypesUI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // there are 8 types of data types
        // we will take all data types value from user
        System.out.print("Take input for byte datatype : ");
        byte a = scanner.nextByte();
        System.out.print("Take input for short datatype : ");
        short b = scanner.nextShort();
        System.out.print("Take input for int datatype : ");
        int num = scanner.nextInt();
        System.out.print("Take input for long datatype : ");
        long number = scanner.nextLong();
        System.out.print("Take input for float datatype : ");
        float desimal = scanner.nextFloat();
        System.out.print("Take input for double datatype : ");
        double Desimal = scanner.nextDouble();
        System.out.print("Take input for Char datatype : ");
        char name = scanner.next().charAt(0);
        System.out.print("Take input for Boolean datatype : ");
        boolean condition = scanner.hasNextBoolean();


        System.out.println("Input for byte Datatype : " + a);
        System.out.println("Input for short Datatype : " + b);
        System.out.println("Input for int Datatype : " + num);
        System.out.println("Input for long Datatype : " + number);
        System.out.println("Input for float Datatype : " + desimal);
        System.out.println("Input for double Datatype : " + Desimal);
        System.out.println("Input for char Datatype : " + name);
        System.out.println("Input for boolean Datatype : " + condition);

    }
}
