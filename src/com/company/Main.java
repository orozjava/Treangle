package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner sc = new Scanner(System.in);
        triangle.a = sc.nextFloat();
        triangle.b = sc.nextFloat();
        triangle.c = sc.nextFloat();

        triangle.area();

    }

}
