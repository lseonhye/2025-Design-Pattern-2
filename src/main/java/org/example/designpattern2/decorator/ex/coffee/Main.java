package org.example.designpattern2.decorator.ex.coffee;

public class Main {
    public static void main(String[] args) {

        Coffee order1 = new Milk(new Sugar(new Americano()));

        System.out.println(order1.getDescription());
        System.out.println("Total Price: " + order1.cost() + "원");

        Coffee order2 =
                new WhippedCream(
                        new Vanilla(
                                new Latte()
                        )
                );

        System.out.println(order2.getDescription());
        System.out.println("Total Price: " + order2.cost() + "원");
    }
}