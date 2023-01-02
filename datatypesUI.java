package com.java.basics;

import java.util.Scanner;

public class datatypesUI {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // there are 8 types of data types
        // we will take all data types value from user
        System.out.print("Take input for byte datatype : ");
        byte a = scn.nextByte();
        System.out.print("Take input for short datatype : ");
        short b = scn.nextShort();
        System.out.print("Take input for int datatype : ");
        int num = scn.nextInt();
        System.out.print("Take input for long datatype : ");
        long number = scn.nextLong();
        System.out.print("Take input for float datatype : ");
        float desimal = scn.nextFloat();
        System.out.print("Take input for double datatype : ");
        double Desimal = scn.nextDouble();
        System.out.print("Take input for Char datatype : ");
        char name = scn.next().charAt(0);
        System.out.print("Take input for Boolean datatype : ");
        boolean condition = scn.hasNextBoolean();


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
