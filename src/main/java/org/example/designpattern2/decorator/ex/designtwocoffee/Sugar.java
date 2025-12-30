package org.example.designpattern2.decorator.ex.designtwocoffee;

public class Sugar extends CoffeeDecorator {

    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + Sugar";
    }

    @Override
    public int cost() {
        return coffee.cost() + 200;
    }
}