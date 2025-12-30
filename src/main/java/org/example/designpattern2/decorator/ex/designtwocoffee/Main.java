//package org.example.designpattern2.decorator.ex.designtwocoffee;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Coffee order1 = new Milk(new Sugar(new Americano()));
//
//        System.out.println(order1.getDescription());
//        System.out.println("Total Price: " + order1.cost() + "원");
//
//        Coffee order2 =
//                new WhippedCream(
//                        new Vanilla(
//                                new Latte()
//                        )
//                );
//
//        System.out.println(order2.getDescription());
//        System.out.println("Total Price: " + order2.cost() + "원");
//    }
//}

package org.example.designpattern2.decorator.ex.designtwocoffee;

import org.example.designpattern2.decorator.ex.designtwocoffee.strategy.KakaoPayment;
import org.example.designpattern2.decorator.ex.designtwocoffee.strategy.NaverPayment;
import org.example.designpattern2.decorator.ex.designtwocoffee.strategy.PaymentStrategy;
import org.example.designpattern2.decorator.ex.designtwocoffee.strategy.CardPayment;

public class Main {
    public static void main(String[] args) {

        Coffee order1 = new Milk(new Sugar(new Americano()));

        System.out.println(order1.getDescription());
        System.out.println("Total Price: " + order1.cost() + "원");

        // Strategy 적용
        PaymentStrategy payment1 = new NaverPayment();
        payment1.pay(order1.cost());

        System.out.println();

        Coffee order2 =
                new WhippedCream(
                        new Vanilla(
                                new Latte()
                        )
                );

        System.out.println(order2.getDescription());
        System.out.println("Total Price: " + order2.cost() + "원");

        PaymentStrategy payment2 = new KakaoPayment();
        payment2.pay(order2.cost());

        Coffee order3 =
                new WhippedCream(
                        new Sugar(
                                new Americano()
                        )
                );

        System.out.println(order3.getDescription());
        System.out.println("Total Price: " + order3.cost() + "원");

        PaymentStrategy payment3 = new NaverPayment();
        payment3.pay(order3.cost());
    }
}