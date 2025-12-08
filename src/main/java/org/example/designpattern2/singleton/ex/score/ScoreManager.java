package org.example.designpattern2.singleton.ex.score;

public class ScoreManager {
    // 단 하나의 인스턴스를 저장할 정적 변수
    private static ScoreManager instance;

    // 점수 변수
    private int score = 0;

    // private 생성자 → 외부에서 new로 생성 불가
    private ScoreManager() {}

    // 인스턴스를 반환하는 메서드
    public static ScoreManager getInstance() {
        if (instance == null) {
            instance = new ScoreManager();  // 최초 1회만 생성
        }
        return instance;
    }

    // 점수 추가
    public void addScore(int points) {
        score += points;
        System.out.println(points + "점 추가! 현재 점수: " + score);
    }

    // 점수 조회
    public int getScore() {
        return score;
    }
}