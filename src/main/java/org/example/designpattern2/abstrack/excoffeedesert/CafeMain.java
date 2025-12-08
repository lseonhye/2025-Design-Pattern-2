package org.example.designpattern2.abstrack.excoffeedesert;

import org.example.designpattern2.abstrack.excoffeedesert.concretefactories.ItalyCafeFactory;
import org.example.designpattern2.abstrack.excoffeedesert.concretefactories.KoreaCafeFactory;

public class CafeMain {
    public static void main(String[] args) {
        // 🇰🇷 한국 카페 세트
        CafeFactory koreaFactory = new KoreaCafeFactory();
        System.out.println("=== 한국 카페 세트 ===");
        koreaFactory.createCoffee().brew();
        koreaFactory.createDessert().serve();

        System.out.println();

        // 🇮🇹 이탈리아 카페 세트
        CafeFactory italyFactory = new ItalyCafeFactory();
        System.out.println("=== 이탈리아 카페 세트 ===");
        italyFactory.createCoffee().brew();
        italyFactory.createDessert().serve();
    }
}