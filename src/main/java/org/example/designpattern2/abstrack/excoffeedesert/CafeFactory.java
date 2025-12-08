package org.example.designpattern2.abstrack.excoffeedesert;

import org.example.designpattern2.abstrack.excoffeedesert.abstractproducts.Coffee;
import org.example.designpattern2.abstrack.excoffeedesert.concreateproducts.ItalianDessert;

public interface CafeFactory {
    Coffee createCoffee();
    ItalianDessert createDessert();
}