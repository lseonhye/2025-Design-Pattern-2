package org.example.designpattern2.observer.ex.stock;

public class Investor implements Observer {
    private final String name;
    private final double buyPrice;
    private final double alertThreshold;

    public Investor(String name, double buyPrice, double alertThreshold) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.alertThreshold = alertThreshold;
    }

    @Override
    public String toString() {
        return "Investor{" +
                "name='" + name + '\'' +
                ", buyPrice=" + buyPrice +
                ", alertThreshold=" + alertThreshold +
                '}';
    }

    @Override
    public void update(Stock stock) {
        double current = stock.getPrice();
        double rate = (current - buyPrice) / buyPrice * 100;

        if (rate <= alertThreshold) {
            System.out.printf("[ALERT] %s: %s %.2f원 → %.2f원 (%.2f%%)\n",
                    name, stock.getName(), buyPrice, current, rate);
        }
    }
}
