package org.example.designpattern2.strategy.ex.discount;

import java.math.BigDecimal;
import java.util.Objects;

public class PricingService {
    private DiscountStrategy strategy;

    public PricingService(DiscountStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy, "할인 전략(strategy)은 null일 수 없습니다.");
    }

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy);
    }

    public BigDecimal calculatePrice(BigDecimal originalPrice) {
        return strategy.apply(originalPrice);
    }
}
