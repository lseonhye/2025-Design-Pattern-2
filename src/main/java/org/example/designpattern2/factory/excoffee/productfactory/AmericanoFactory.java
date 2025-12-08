package org.example.designpattern2.factory.excoffee.productfactory;

import org.example.designpattern2.factory.excoffee.Coffee;
import org.example.designpattern2.factory.excoffee.CoffeeFactory;
import org.example.designpattern2.factory.excoffee.product.Americano;

public class AmericanoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Americano();
    }
}