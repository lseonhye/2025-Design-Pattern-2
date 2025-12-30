package org.example.designpattern2.designtwocoffee;

public class Americano implements Coffee {

    @Override
    public String getDescription() {
        return "Americano";
    }

    @Override
    public int cost() {
        return 3000;
    }
}