package com.epam.OOP;

public class Main {

    public static void main(String[] args) {
        //  return description contains short info (use method from Animal class)
        System.out.println(new Dog().getDescription());

        //  return description contains full info (use method from Bird class)
        System.out.println(new Bird().getDescription());
    }
}