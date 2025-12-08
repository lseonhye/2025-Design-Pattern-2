package org.example.designpattern2.singleton.ex.score;

public class SafeScoreManager {
    // 점수 변수
    private int score = 0;

    // private 생성자 → 외부에서 new로 생성 불가
    private SafeScoreManager() {}

    // 내부 정적 클래스 (Bill Pugh 방식)
    private static class Holder {
        // 클래스 로드 시 단 한 번만 초기화됨 (Thread Safe)
        private static final SafeScoreManager INSTANCE = new SafeScoreManager();
    }

    // 외부에서 인스턴스 접근
    public static SafeScoreManager getInstance() {
        return Holder.INSTANCE;
    }

    // 점수 추가 (여러 스레드에서 동시에 호출될 수 있으므로 동기화)
    public synchronized void addScore(int points) {
        score += points;
        System.out.println(Thread.currentThread().getName() +
                " : " + points + "점 추가 → 현재 점수: " + score);
    }

    // 점수 조회
    public int getScore() {
        return score;
    }
}