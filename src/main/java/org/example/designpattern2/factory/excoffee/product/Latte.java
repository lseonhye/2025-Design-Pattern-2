package org.example.designpattern2.factory.excoffee.product;

import org.example.designpattern2.factory.excoffee.Coffee;

public class Latte implements Coffee {
    @Override
    public void brew() {
        System.out.println("라떼를 내립니다 🥛");
    }
}