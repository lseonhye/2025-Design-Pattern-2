package org.example.designpattern2.decorator.ex.coffee;

public class Latte implements Coffee {

    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public int cost() {
        return 4000;
    }
}