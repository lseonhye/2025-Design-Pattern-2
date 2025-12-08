package org.example.designpattern2.abstrack.excoffeedesert.concretefactories;

import org.example.designpattern2.abstrack.excoffeedesert.CafeFactory;
import org.example.designpattern2.abstrack.excoffeedesert.abstractproducts.Coffee;
import org.example.designpattern2.abstrack.excoffeedesert.concreateproducts.ItalianDessert;
import org.example.designpattern2.abstrack.excoffeedesert.concreateproducts.KoreanCoffee;
import org.example.designpattern2.abstrack.excoffeedesert.concreateproducts.KoreanDessert;

public class KoreaCafeFactory implements CafeFactory {
    @Override
    public Coffee createCoffee() {
        return new KoreanCoffee();
    }

    @Override
    public ItalianDessert createDessert() {
        return new ItalianDessert();
    }
}