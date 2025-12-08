package org.example.designpattern2.strategy.ex.discount;

import java.math.BigDecimal;

public interface DiscountStrategy {
    BigDecimal apply(BigDecimal originalPrice);
}
