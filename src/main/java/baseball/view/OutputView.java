package baseball.view;

public class OutputView {
    public static void enter(){
        System.out.println("세 자리 숫자를 입력하세요");
    }
    public static void restart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 눌러주세요");
    }

    public static void allStrike(int strike) {
        System.out.println(strike + "개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
    public static void checkStrike(int strike) {
        System.out.println(strike + "스트라이크");
    }
    public static void checkBall(int ball) {
        System.out.println(ball + "볼");
    }
    public static void nothing() {
        System.out.println("낫싱");
    }
}
