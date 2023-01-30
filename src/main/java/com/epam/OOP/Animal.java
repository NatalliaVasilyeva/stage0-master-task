package com.epam.OOP;

import java.util.Objects;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getColor() {
        return color;
    }
    public int getNumberOfPaws() {
        return numberOfPaws;
    }
    public boolean isHasFur() {
        return hasFur;
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("This animal is mostly %s. It has %d %s ", this.getColor(), this.getNumberOfPaws(), this.getNumberOfPaws() > 1 ? "paws" : "paw"))
            .append(String.format("and %s fur.", this.isHasFur() ? "a" : "no"));
        return sb.toString();
    }
}