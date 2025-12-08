package org.example.designpattern2.observer.ex.stock;

public class Main {
    public static void main(String[] args) {
        Stock samsung = new Stock("Samsung", 70000);
        Stock lg = new Stock("LG", 90000);

        Investor A = new Investor("A", 70000,-5);
        Investor B = new Investor("B", 90000,-7);

        samsung.subscribe(A);
        lg.subscribe(B);

        System.out.println("가격변동 발생");
        samsung.changePrice(66000);
        lg.changePrice(85000);

        System.out.println("B LG 매도");
        lg.unsubscrbe(B);

        System.out.println("가격 추가 변동");
        samsung.changePrice(65000);
        lg.changePrice(81000);

    }
}
