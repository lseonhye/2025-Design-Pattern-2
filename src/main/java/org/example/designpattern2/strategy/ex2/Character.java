package org.example.designpattern2.strategy.ex2;

public class Character {
    private String weapon; // "sword", "magic", "gun" 등으로 구분

    public Character(String weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon.equals("sword")) {
            System.out.println("검으로 베기!");
        } else if (weapon.equals("magic")) {
            System.out.println("파이어볼 발사!");
        } else if (weapon.equals("gun")) {
            System.out.println("총알 발사!");
        } else {
            System.out.println("맨손 공격!");
        }
    }

    public static void main(String[] args) {
        Character c = new Character("sword");
        c.attack();

        // 무기 교체
        c = new Character("magic");
        c.attack();

        // 또 교체
        c = new Character("gun");
        c.attack();
    }
}