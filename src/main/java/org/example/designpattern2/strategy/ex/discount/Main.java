package org.example.designpattern2.strategy.ex.discount;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // 상품 생성
        OrderLine order = new OrderLine("P001", "망고시루", new BigDecimal("50000"), 3);
        BigDecimal original = order.totalOriginal(); // 39,800

        // Context 생성 (기본 전략: 할인 없음)
        PricingService pricing = new PricingService(new NoDiscount());

        System.out.println("상품명: " + order.getName());
        System.out.println("원가: " + original + "원\n");

        // 전략 1: 할인 없음
        System.out.println("[전략] NoDiscount  → " + pricing.calculatePrice(original) + "원");

        // 전략 2: 10% 할인
        pricing.setStrategy(new RateDiscount(new BigDecimal("0.10")));
        System.out.println("[전략] Rate 10%    → " + pricing.calculatePrice(original) + "원");

        // 전략 3: 5,000원 할인
        pricing.setStrategy(new FixedAmountDiscount(new BigDecimal("5000")));
        System.out.println("[전략] Fixed 5000  → " + pricing.calculatePrice(original) + "원");

        // 전략 4: 과도한 할인 테스트 (음수 방지)
        pricing.setStrategy(new FixedAmountDiscount(new BigDecimal("100000")));
        System.out.println("[전략] Fixed 100k  → " + pricing.calculatePrice(original) + "원");
    }
}
