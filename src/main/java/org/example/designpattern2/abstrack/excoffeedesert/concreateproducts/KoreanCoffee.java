package org.example.designpattern2.abstrack.excoffeedesert.concreateproducts;

import org.example.designpattern2.abstrack.excoffeedesert.abstractproducts.Coffee;

public class KoreanCoffee implements Coffee {
    @Override
    public void brew() {
        System.out.println("한국식 커피를 내립니다 ☕");
    }
}