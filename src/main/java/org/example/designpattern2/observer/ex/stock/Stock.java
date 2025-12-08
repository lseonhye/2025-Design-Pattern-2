package org.example.designpattern2.observer.ex.stock;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private final String name;
    private double price;
    private final List<Observer> observers = new ArrayList<>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", observers=" + observers +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
        System.out.println(observer + "구독 시작" + name);


    }

    @Override
    public void unsubscrbe(Observer observer) {
        observers.remove(observer);
        System.out.println(observer + "구독 해지" + name);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }

    }
    public void changePrice(double newPrice) {
        System.out.printf("\n[%s] 가격 %.2f → %.2f 변경\n", name, price, newPrice);
        this.price = newPrice;
        notifyObservers();
    }
}