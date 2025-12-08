package org.example.designpattern2.strategy.ex.discount;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RateDiscount implements DiscountStrategy {
    private final BigDecimal rate;

    public RateDiscount(BigDecimal rate) {
        if (rate == null || rate.compareTo(BigDecimal.ZERO) < 0 || rate.compareTo(BigDecimal.ONE) > 0) {
            throw new IllegalArgumentException("할인율(rate)은 0.0 이상 1.0 이하이어야 합니다.");
        }
        this.rate = rate;
    }

    @Override
    public BigDecimal apply(BigDecimal originalPrice) {
        if (originalPrice == null) return BigDecimal.ZERO;
        BigDecimal discount = originalPrice.multiply(rate);
        BigDecimal result = originalPrice.subtract(discount);
        return result.max(BigDecimal.ZERO).setScale(0, RoundingMode.HALF_UP);
    }
}