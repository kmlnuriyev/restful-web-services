package com.example.restfulwebservices.junitex;

public class Math {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {

        if (b == 0)
            throw new IllegalArgumentException("Cannot divide by zero");

        return a / b;
    }
}
