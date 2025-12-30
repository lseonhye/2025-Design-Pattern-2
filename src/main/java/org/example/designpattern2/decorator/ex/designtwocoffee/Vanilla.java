package org.example.designpattern2.decorator.ex.designtwocoffee;

public class Vanilla extends CoffeeDecorator {

    public Vanilla(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Vanilla";
    }

    @Override
    public int cost() {
        return coffee.cost() + 700;
    }
}