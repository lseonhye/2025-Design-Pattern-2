package org.example.designpattern2.factory.excoffee;


import org.example.designpattern2.factory.excoffee.productfactory.AmericanoFactory;
import org.example.designpattern2.factory.excoffee.productfactory.EspressoFactory;
import org.example.designpattern2.factory.excoffee.productfactory.LatteFactory;

public class CoffeeMain {
    public static void main(String[] args) {
        CoffeeFactory americanoFactory = new AmericanoFactory();
        CoffeeFactory latteFactory = new LatteFactory();
        CoffeeFactory espressoFactory = new EspressoFactory();

        americanoFactory.orderCoffee();
        latteFactory.orderCoffee();
        espressoFactory.orderCoffee();
    }
}