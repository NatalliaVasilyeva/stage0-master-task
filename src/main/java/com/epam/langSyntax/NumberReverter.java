package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int revertedNumber = 0;
        while (number > 0) {
            revertedNumber = revertedNumber * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(revertedNumber);
    }
}