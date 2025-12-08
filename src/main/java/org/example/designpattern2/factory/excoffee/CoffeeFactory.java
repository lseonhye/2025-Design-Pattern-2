package org.example.designpattern2.factory.excoffee;

public abstract class CoffeeFactory {
    // 팩토리 메소드 (추상 메서드)
    public abstract Coffee createCoffee();

    // 공통 로직 (주문 과정)
    public void orderCoffee() {
        Coffee coffee = createCoffee();
        coffee.brew();
        System.out.println("커피 준비 완료!\n");
    }
}