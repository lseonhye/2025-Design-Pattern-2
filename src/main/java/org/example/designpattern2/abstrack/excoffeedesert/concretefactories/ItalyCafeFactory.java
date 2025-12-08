package org.example.designpattern2.abstrack.excoffeedesert.concretefactories;


import org.example.designpattern2.abstrack.excoffeedesert.CafeFactory;
import org.example.designpattern2.abstrack.excoffeedesert.abstractproducts.Coffee;
import org.example.designpattern2.abstrack.excoffeedesert.concreateproducts.ItalianCoffee;
import org.example.designpattern2.abstrack.excoffeedesert.concreateproducts.ItalianDessert;

public class ItalyCafeFactory implements CafeFactory {
    @Override
    public Coffee createCoffee() {
        return new ItalianCoffee();
    }

    @Override
    public ItalianDessert createDessert() {
        return new ItalianDessert();
    }
}
