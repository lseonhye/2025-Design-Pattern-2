package org.example.designpattern2.decorator.ex.designtwocoffee.strategy;

public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("카드로 " + amount + "원 결제");
    }
}