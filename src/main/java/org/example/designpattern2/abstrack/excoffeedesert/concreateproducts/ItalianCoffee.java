package org.example.designpattern2.abstrack.excoffeedesert.concreateproducts;

import org.example.designpattern2.abstrack.excoffeedesert.abstractproducts.Coffee;

public class ItalianCoffee implements Coffee {
    @Override
    public void brew() {
        System.out.println("이탈리아식 에스프레소를 내립니다 ☕️");
    }
}