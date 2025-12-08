package org.example.designpattern2.decorator.ex.coffee;

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