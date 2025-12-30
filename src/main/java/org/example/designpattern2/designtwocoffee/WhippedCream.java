package org.example.designpattern2.designtwocoffee;

public class WhippedCream extends CoffeeDecorator {

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + WhippedCream";
    }

    @Override
    public int cost() {
        return coffee.cost() + 1000;
    }
}