package baseball.service;

import java.util.List;

public class GameService {
    public static int[] countStrikeBall(List<Integer> userBall, List<Integer> computerBall) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 3; i++) {
            if (userBall.get(i).equals(computerBall.get(i))){
                strike++;
            } else if (computerBall.contains(userBall.get(i))) {
                ball++;
            }
        }
        return new int[] {strike,ball};
    }
}
