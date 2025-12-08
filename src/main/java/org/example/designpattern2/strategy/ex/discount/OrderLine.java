package org.example.designpattern2.strategy.ex.discount;

import java.math.BigDecimal;
import java.util.Objects;

public class OrderLine {
    private final String productId;
    private final String name;
    private final BigDecimal unitPrice;
    private final int quantity;

    public OrderLine(String productId, String name, BigDecimal unitPrice, int quantity) {
        this.productId = Objects.requireNonNull(productId);
        this.name = Objects.requireNonNull(name);
        this.unitPrice = Objects.requireNonNull(unitPrice);
        if (quantity <= 0) throw new IllegalArgumentException("수량(quantity)은 0보다 커야 합니다.");
        this.quantity = quantity;
    }

    public BigDecimal totalOriginal() {
        return unitPrice.multiply(BigDecimal.valueOf(quantity));
    }

    public String getName() { return name; }
}
