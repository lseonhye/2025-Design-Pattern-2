package org.example.designpattern2.abstrack.excoffeedesert.concreateproducts;

import org.example.designpattern2.abstrack.excoffeedesert.abstractproducts.Dessert;

public class KoreanDessert implements Dessert {
    @Override
    public void serve() {
        System.out.println("한국식 디저트(인절미 케이크)를 제공합니다 🍰");
    }
}