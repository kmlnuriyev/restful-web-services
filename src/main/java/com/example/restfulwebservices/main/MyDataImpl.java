package com.example.restfulwebservices.main;

public class MyDataImpl implements MyData {

    public boolean isNull(String s) {

        System.out.println("Implementation isNull :: " + s);

        if (s == null) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyDataImpl obj = new MyDataImpl();
        obj.print("");
        obj.isNull("Kamal");
    }
}
