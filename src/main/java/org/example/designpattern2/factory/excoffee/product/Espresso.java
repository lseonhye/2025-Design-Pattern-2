package org.example.designpattern2.factory.excoffee.product;

import org.example.designpattern2.factory.excoffee.Coffee;

public class Espresso implements Coffee {
    @Override
    public void brew() {
        System.out.println("에스프레소를 내립니다 ☕️");
    }
}