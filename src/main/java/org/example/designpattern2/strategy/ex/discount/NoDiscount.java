package org.example.designpattern2.strategy.ex.discount;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NoDiscount implements DiscountStrategy {
    @Override
    public BigDecimal apply(BigDecimal originalPrice) {
        if (originalPrice == null) return BigDecimal.ZERO;
        return normalize(originalPrice);
    }

    protected BigDecimal normalize(BigDecimal price) {
        // 0원 미만이 되지 않도록 보정하고 원단위 반올림
        return price.max(BigDecimal.ZERO).setScale(0, RoundingMode.HALF_UP);
    }
}
