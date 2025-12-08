package org.example.designpattern2.singleton.ex.score;

public class GameMain {
    public static void main(String[] args) {
        // 같은 인스턴스를 여러 변수에 저장
        ScoreManager player1 = ScoreManager.getInstance();
        ScoreManager player2 = ScoreManager.getInstance();

        // 점수 추가
        player1.addScore(10);
        player2.addScore(20);

        // 같은 인스턴스를 공유하므로 결과는 누적된다
        System.out.println("최종 점수: " + player1.getScore());
        System.out.println("player1 == player2 ? " + (player1 == player2));
    }
}
