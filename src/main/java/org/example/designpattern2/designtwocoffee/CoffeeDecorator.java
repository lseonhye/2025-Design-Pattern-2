package org.example.designpattern2.designtwocoffee;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee; // 컴포지션(Composition)

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public int cost() {
        return coffee.cost();
    }
}