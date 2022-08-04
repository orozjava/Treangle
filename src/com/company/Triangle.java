package com.company;

public class Triangle {
    float a;
    float b;
    float c;

    public void area() {

        float s = (a + b + c) / 2F;
        System.out.println("Площадь треугольника: " + Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }

}
