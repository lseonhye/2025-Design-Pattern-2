package org.example.designpattern2.abstrack.excoffeedesert.concreateproducts;

import org.example.designpattern2.abstrack.excoffeedesert.abstractproducts.Dessert;

public class ItalianDessert implements Dessert {
    @Override
    public void serve() {
        System.out.println("이탈리아식 디저트(티라미수)를 제공합니다 🍮");
    }
}
