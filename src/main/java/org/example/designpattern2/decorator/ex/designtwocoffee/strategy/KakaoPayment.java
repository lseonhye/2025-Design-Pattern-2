package org.example.designpattern2.decorator.ex.designtwocoffee.strategy;

public class KakaoPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("카카오페이로 " + amount + "원 결제");
    }
}