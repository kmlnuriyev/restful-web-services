package com.example.restfulwebservices.main;

public interface MyData {

    default void print(String s) {
        System.out.println("Interface print is :: " + s);
    }

    default boolean isNull(String s) {

        System.out.println("Interface isNull is :: " + s);

        if (s == null) {
            return true;
        }
        return false;
    }
}
