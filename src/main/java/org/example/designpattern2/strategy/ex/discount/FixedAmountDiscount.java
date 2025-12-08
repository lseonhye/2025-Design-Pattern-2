package org.example.designpattern2.strategy.ex.discount;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FixedAmountDiscount implements DiscountStrategy {
    private final BigDecimal amount;

    public FixedAmountDiscount(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("할인 금액(amount)은 0 이상이어야 합니다.");
        }
        this.amount = amount;
    }

    @Override
    public BigDecimal apply(BigDecimal originalPrice) {
        if (originalPrice == null) return BigDecimal.ZERO;
        BigDecimal result = originalPrice.subtract(amount);
        return result.max(BigDecimal.ZERO).setScale(0, RoundingMode.HALF_UP);
    }
}
