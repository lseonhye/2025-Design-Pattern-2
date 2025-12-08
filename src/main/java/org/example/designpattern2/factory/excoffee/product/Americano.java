package org.example.designpattern2.factory.excoffee.product;

import org.example.designpattern2.factory.excoffee.Coffee;

public class Americano implements Coffee {
    @Override
    public void brew() {
        System.out.println("아메리카노를 내립니다 ☕");
    }
}