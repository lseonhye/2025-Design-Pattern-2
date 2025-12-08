package org.example.designpattern2.singleton.ex.score;

public class SafeGameMain {
    public static void main(String[] args) {
        // 동일한 인스턴스를 여러 스레드에서 공유
        Runnable task = () -> {
            SafeScoreManager manager = SafeScoreManager.getInstance();
            manager.addScore(10);
        };

        // 3개의 스레드가 동시에 실행
        Thread t1 = new Thread(task, "Player1");
        Thread t2 = new Thread(task, "Player2");
        Thread t3 = new Thread(task, "Player3");

        t1.start();
        t2.start();
        t3.start();

        // 메인 스레드 대기 (스레드 종료까지 잠시 대기)
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 최종 점수 출력
        System.out.println("최종 점수: " + SafeScoreManager.getInstance().getScore());
    }
}