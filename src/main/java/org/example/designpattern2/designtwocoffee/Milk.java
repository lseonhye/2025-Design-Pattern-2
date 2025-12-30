package org.example.designpattern2.designtwocoffee;

public class Milk extends CoffeeDecorator {

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Milk";
    }

    @Override
    public int cost() {
        return coffee.cost() + 500;
    }
}