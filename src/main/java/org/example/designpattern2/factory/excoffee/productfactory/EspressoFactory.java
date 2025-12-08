package org.example.designpattern2.factory.excoffee.productfactory;

import org.example.designpattern2.factory.excoffee.Coffee;
import org.example.designpattern2.factory.excoffee.CoffeeFactory;
import org.example.designpattern2.factory.excoffee.product.Espresso;

public class EspressoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
}