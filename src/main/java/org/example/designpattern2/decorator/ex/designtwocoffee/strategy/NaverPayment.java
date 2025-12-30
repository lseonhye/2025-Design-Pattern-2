package org.example.designpattern2.decorator.ex.designtwocoffee.strategy;

public class NaverPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("네이버페이로 " + amount + "원 결제");
    }
}